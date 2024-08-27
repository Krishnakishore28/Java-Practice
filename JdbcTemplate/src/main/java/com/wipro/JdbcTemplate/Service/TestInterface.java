package com.wipro.JdbcTemplate.Service;

import java.util.List;

import com.wipro.JdbcTemplate.Entity.Student;

public interface TestInterface {
	int insert(Student student);

	List<Student> selectStudents();
	Student fetchByRollNo(int rollno);
	public boolean deleteByRollNo(int rollno);
	public void truncate();
	public boolean deleteNameAndCity(String name,String city);
	public void getByName(String name);
	public void getByCityNames() ;
	public int updateStudent(Student student);
	public int BatchUpdate(List<Student> students);
}
