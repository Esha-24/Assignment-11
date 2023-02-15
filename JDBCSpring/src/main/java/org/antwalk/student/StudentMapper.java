package org.antwalk.student;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setStudentid(rs.getInt("studentid"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		student.setAddress(rs.getString("address"));
		
		return student;
	}

	

}
