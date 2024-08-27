package com.wipro.Config.Service;

import java.util.List;

import com.wipro.Config.Entity.Student;

public interface StudentService {
	List<Student> loadStudents();
	void saveStudent(Student student);
	Student getStudent(int id);
	void updateStudent(Student student);
	void deleteStudent(int id);
}
