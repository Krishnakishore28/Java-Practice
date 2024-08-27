package com.wipro.JdbcTemplate.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.wipro.JdbcTemplate.Entity.Student;

public class StudentResultSetExtractor implements ResultSetExtractor<List<Student>>{

	public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<Student>();
		while(rs.next()) {
			Student student=new Student();
			student.setRollNo(rs.getInt("student_rollno"));
			student.setAddress(rs.getString("student_address"));
			student.setName(rs.getString("student_name"));
			students.add(student);
		}
		return students;
	}

}
