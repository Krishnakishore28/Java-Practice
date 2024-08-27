package com.wipro.JdbcTemplate.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.JdbcTemplate.Entity.Student;

public class StudentHelper {
	@Autowired
	private Test test;
	public void insertStudents(){
		ArrayList<Student> students=new ArrayList<Student>();
		Student student1=new Student();
		student1.setRollNo(1);
		student1.setAddress("Brhmanafuem");
		student1.setName("sumanth");
		students.add(student1);
		Student student2=new Student();
		student2.setRollNo(2);
		student2.setAddress("tanuku");
		student2.setName("siraj");
		students.add(student2);
		Student student3=new Student();
		student3.setRollNo(3);
		student3.setAddress("blr");
		student3.setName("sampath");
		students.add(student3);
		System.out.println(student1);
		test.insertBatch(students);
		
	}
	

}
