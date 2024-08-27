package com.example.SpringBoot2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SpringBoot2.EmployeeDao;
import com.example.SpringBoot2.entity.Employee;

@Controller
public class HomeController {
	@Autowired
	private EmployeeDao employeedao;
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping("/insert")
	public String home(Model model) {
		model.addAttribute("employee", new Employee());
		return "home";
	}
	@RequestMapping("/process")
	public String process(@ModelAttribute("employee") Employee employee) {
		employeedao.save(employee);
		return "success";
	}
	@RequestMapping("/deleteprocess")
	public String deleteprocess() {
		
		return "deleteprocess";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		employeedao.deleteById(id);
		return "delete";
	}
	@RequestMapping("showAll")
	public String show(Model model) {
		model.addAttribute("employees", employeedao.findAll());
		return "getall";
	}
	@RequestMapping("/updaterecord")
	public String updaterecord(@RequestParam("id") int id,Model model) {
		Employee e=employeedao.findById(id).get();
		model.addAttribute("employee", e);
		return "updaterecord";
		
	}
	@RequestMapping("/updated")
	public String updated(@ModelAttribute("employee") Employee employee) {
		employeedao.save(employee);
		return "updated";
	}
	@RequestMapping("/update")
	public String update() {
		return "update";
		
	}
	

}
