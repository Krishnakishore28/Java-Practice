package com.wipro.Config.Repository;

import java.util.List;

import com.wipro.Config.Entity.Student;


public interface StudentRepo {
	List<Student> loadStudents();
	void saveStudent(Student student);
	Student getStudent(int id);
	void updatestudent(Student student);
	void deleteStudent(int id);

}
