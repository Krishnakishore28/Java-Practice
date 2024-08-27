package com.wipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	@Autowired
	private StudentDao studentDao;
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping("/form")
	public String form(Model model) {
		model.addAttribute("student", new Student());
		return "studentform";
	}
	@RequestMapping("/process")
	public String process(@ModelAttribute("student") Student student) {
		studentDao.insertStudent(student);
		return "completed";
	}
	@RequestMapping("/getrecords")
	public String getRecords(Model model) {
		model.addAttribute("students", studentDao.getRecords());
		return "records";
	}
	
	

}
