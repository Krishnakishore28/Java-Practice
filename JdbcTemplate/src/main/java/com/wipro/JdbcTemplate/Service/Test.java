package com.wipro.JdbcTemplate.Service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.JdbcTemplate.Entity.Student;

@Repository("test")
@Transactional
public class Test implements TestInterface {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		System.out.println("hii");
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		// TODO Auto-generated method stub
		String sql = "insert into student values(?,?,?)";
		Object[] arg = { student.getRollNo(), student.getName(), student.getAddress() };
		int records = jdbcTemplate.update(sql, arg);
		return records;
	}

	public List<Student> selectStudents() {
		String sql = "Select * from student";
		List<Student> students = jdbcTemplate.query(sql, new StudentRowMapper());
		return students;
	}

	public int insertBatch(List<Student> students) {
		// TODO Auto-generated method stub
		String sql = "insert into student(student_rollno,student_name,student_address) values(?,?,?)";
		ArrayList<Object[]> args = new ArrayList<Object[]>();
		System.out.println(students);
		for (Student student : students) {
			Object[] arg = { student.getRollNo(), student.getName(), student.getAddress() };
			args.add(arg);
		}
		jdbcTemplate.batchUpdate(sql, args);
		return 1;
	}

	public Student fetchByRollNo(int rollno) {
//		=====custom row mapper==============
//		String sql="select * from student where student_rollno=?";
//		Student student=jdbcTemplate.queryForObject(sql, new StudentRowMapper(), rollno);
//		******* Bean propertyRowMapper ============ use alias
		String sql="select student_rollno as rollNo, student_name as name, student_address as address from student where student_rollno=?";
		Student student=jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Student>(Student.class),rollno);
		return student;
	}
	public boolean deleteByRollNo(int rollno) {
		String sql="delete from student where student_rollno=?";
		int i=jdbcTemplate.update(sql,rollno);
		return i==1;
	}
	public void truncate() {
		String sql="truncate table student";
		jdbcTemplate.execute(sql);
		System.out.println("clean up completeds");
	}
	public boolean deleteNameAndCity(String name,String city) {
		String sql="delete from student where student_address=? or student_name=?";
		int i=jdbcTemplate.update(sql,city,name);
		return i>0;
	}
	public void getByName(String name){
		String sql="select * from student where student_name=?";
		List<Student> students=jdbcTemplate.query(sql, new StudentResultSetExtractor(),name);
		System.out.println(students);
	}
	public void getByCityNames() {
		String sql="select * from student";
		Map<String,List<String>> students=jdbcTemplate.query(sql, new AddressResultSetExtractor());
		System.out.println(students);
	}

	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		String sql="update student set student_address=? where student_rollno=?";
		Object[] args= {student.getAddress(),student.getRollNo()};
		int records=jdbcTemplate.update(sql,args );
		
		return records;
	}
	@Transactional
	public int BatchUpdate(final List<Student> students) {
		// TODO Auto-generated method stub
		String sql="update student set student_address=? where student_rollno=?";
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			public void setValues(PreparedStatement ps, int i) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, students.get(i).getAddress());
				ps.setInt(2, students.get(i).getRollNo());
				
			}

			public int getBatchSize() {
				// TODO Auto-generated method stub
				return students.size();
			}
			
		});
		return 0;
	}

}
