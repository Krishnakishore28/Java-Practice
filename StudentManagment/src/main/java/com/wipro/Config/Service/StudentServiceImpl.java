package com.wipro.Config.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Config.Entity.Student;
import com.wipro.Config.Repository.StudentRepo;
import com.wipro.Config.Repository.StudentRepoImpl;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepoImpl studentRepoImpl;
	@Override
	public List<Student> loadStudents() {
		List<Student> students=studentRepoImpl.loadStudents();
		return students;
	}

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepoImpl.saveStudent(student);

	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Student student=studentRepoImpl.getStudent(id);
		
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepoImpl.updatestudent(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepoImpl.deleteStudent(id);
	}

	



}
