package com.wipro.Config.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wipro.Config.Entity.Student;
import com.wipro.Config.Mapper.StudentRowMapper;
@Repository
public class StudentRepoImpl implements StudentRepo{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Student> loadStudents() {
		// TODO Auto-generated method stub
		String sql="select * from student";
		List<Student> students=jdbcTemplate.query(sql, new StudentRowMapper());
		return students;
	}
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		String sql="insert into student(name,mobile,country) values(?,?,?)";
		Object[] args= {student.getName(),student.getMobile(),student.getCountry()};
		jdbcTemplate.update(sql, args);
		
		
	}
	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		String sql="select * from student where id=?";
		List<Student> student= jdbcTemplate.query(sql, new StudentRowMapper(),id);
		return student.get(0);
		
	}
	@Override
	public void updatestudent(Student student) {
		// TODO Auto-generated method stub
		String sql="update student set name=?,mobile=?,country=? where id=?";
		Object[] args= {student.getName(),student.getMobile(),student.getCountry(),student.getId()};
		jdbcTemplate.update(sql, args);
		
		
	}
	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		String sql="delete from student where id=?";
		jdbcTemplate.update(sql,id);
	}
	

}
