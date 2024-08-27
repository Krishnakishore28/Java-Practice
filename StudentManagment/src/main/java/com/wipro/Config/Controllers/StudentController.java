package com.wipro.Config.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.Config.Entity.Student;
import com.wipro.Config.Repository.StudentRepoImpl;
import com.wipro.Config.Service.StudentServiceImpl;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	@GetMapping("/students")
	public String loadStudents(Model model) {
		List<Student> students=studentServiceImpl.loadStudents();
		model.addAttribute("students", students);
		for(Student student:students) {
			System.out.println(student);
		}
		return "index";
	}
	@GetMapping("/")
	@ResponseBody
	public String hello() {
		return "hii";
	}
	@GetMapping("/insert-student")
	public String insert(Model model) {
		model.addAttribute("student",new Student());
		return "insert";
	}
	@PostMapping("/save-student")
	public String saveStudent(Student student) {
		if(student.getId()==0) {
			System.out.println("hii");
			studentServiceImpl.saveStudent(student);
		}
		else {
			studentServiceImpl.updateStudent(student);
		}
		
		return "redirect:/students";
	}
	@GetMapping("/update-student")
	public String updateStudent(@RequestParam("id") int id, Model model) {
		Student student=studentServiceImpl.getStudent(id);
		model.addAttribute("student", student);
		return "insert";
	}
	@GetMapping("/delete-student")
	public String deleteStudent(@RequestParam("id") int id) {
		studentServiceImpl.deleteStudent(id);
		return "redirect:/students";
	}

}
