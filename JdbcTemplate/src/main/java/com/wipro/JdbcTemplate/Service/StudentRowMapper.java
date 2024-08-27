package com.wipro.JdbcTemplate.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wipro.JdbcTemplate.Entity.Student;

public class StudentRowMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setRollNo(rs.getInt("student_rollno") );
		student.setName(rs.getString("student_name"));
		student.setAddress(rs.getString("student_address"));
		return student;
	}

}
