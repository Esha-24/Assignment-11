package org.antwalk.student;

import java.util.List;

import javax.sql.DataSource;



public interface StudentDao {
	
	public void setDataSource(DataSource ds);

	 void create(String name, Integer age, String address);
	 
	 Student getStudents(Integer studentid);
	 
	 List listStudents();
	 
	 void delete(Integer studentid);
	 
	 void update(Integer studentid, Integer age);

}
