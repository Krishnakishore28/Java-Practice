package com.example.SpringBoot3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SpringBoot3.EmployeeDao;
import com.example.SpringBoot3.entity.Employee;

@Controller
public class HomeController {
	@Autowired
	private EmployeeDao employeedao;
	@GetMapping("/")
	public String welcome() {
		System.out.println("hii");
		return "welcome";
	}
	@GetMapping("/insert")
	public String home(Model model) {
		System.out.println("byr");
		model.addAttribute("employee", new Employee());
		return "home";
	}
	@PostMapping("/process")
	public String process(@ModelAttribute("employee") Employee employee) {
		employeedao.save(employee);
		return "success";
	}
	@GetMapping("/deleteprocess")
	public String deleteprocess() {
		
		return "deleteprocess";
	}

	@PostMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		employeedao.deleteById(id);
		return "delete";
	}
	@GetMapping("showAll")
	public String show(Model model) {
		model.addAttribute("employees", employeedao.findAll());
		return "getall";
	}
	@GetMapping("/updaterecord")
	public String updaterecord(@RequestParam("id") int id,Model model) {
		Employee e=employeedao.findById(id).get();
		model.addAttribute("employee", e);
		return "updaterecord";
		
	}
	@PostMapping("/updated")
	public String updated(@ModelAttribute("employee") Employee employee) {
		employeedao.save(employee);
		return "updated";
	}
	@GetMapping("/update")
	public String update() {
		return "update";
		
	}
	

}
