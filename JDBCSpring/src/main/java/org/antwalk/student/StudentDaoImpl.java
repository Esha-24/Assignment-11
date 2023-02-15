package org.antwalk.student;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class StudentDaoImpl implements StudentDao{
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObj;
	
	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObj = jdbcTemplateObject;
	}

	public void setDataSource(DataSource ds) {
		this.dataSource = ds;// initializing connection
		this.jdbcTemplateObj = new JdbcTemplate(dataSource);
	}

	public void create(String name, Integer age, String address) {		  
		try {
		 String SQL = "INSERT INTO Student (name, age, address) VALUES (?, ?, ?)";
		 jdbcTemplateObj.update(SQL, new Object[]{name, age, address} );
		 System.out.println("Created Record Name = " + name + " Age = " + age+ " Address = " + address);
		 // to simulate the exception.
		 //throw new RuntimeException("simulate Error condition") ;
		  } catch (DataAccessException e) {
		       System.out.println("Error in creating record, rolling back");
		       throw e;
		    }
		}
	 public Student getStudents(Integer studentid) {
		  String SQL = "SELECT * FROM student WHERE studentid = ?";
		  Student student = (Student) jdbcTemplateObj.queryForObject(SQL, new Object[]{studentid}, new StudentMapper());
		     return student;
		 }
	 public List listStudents() {
		  String SQL = "SELECT * FROM Student";
		  List students = (List) jdbcTemplateObj.query(SQL, new StudentMapper());
		     return students;
		 }
	 
	 public void delete(Integer studentid) {
		  String SQL = "DELETE FROM student WHERE studentid = ?";
		  jdbcTemplateObj.update(SQL, new Object[]{studentid});
		  System.out.println("\nDeleted Record with studentID = " + studentid +" successfully");
		 }
	 public void update(Integer studentid, Integer age) {
		   String SQL = "UPDATE student SET age = ? WHERE studentid = ?";
		   jdbcTemplateObj.update(SQL, new Object[]{age, studentid});
		   System.out.println("\nUpdated Record with studentID = " + studentid +" successfully.");
		 }

	
}
