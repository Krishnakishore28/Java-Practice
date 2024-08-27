package com.example.ibm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ibm.entity.Employee;

@Controller
public class Start {
	@GetMapping("/hello")
	public String get(Model model) {
		Employee e=new Employee();
		e.setStatus("not started");
		model.addAttribute("start",e); 
		
		return "start";
	}
	@PostMapping("/start")
	public String start(@ModelAttribute("start") Employee emp,Model model) {
		if(emp.getEmpId()!=null && emp.getEmpName()!=null && !emp.getEmpName().equals("")) {
			emp.setStatus("in stage1");
			emp.setProjectApprover("suveeta");
			model.addAttribute("emp", emp);
			return "stage1";
		}
		model.addAttribute("start",emp); 
		return "start";
	}
	@PostMapping("stage1")
	public String stage1(@ModelAttribute("start") Employee emp,Model model) {
		if(emp.getProject()!=null && !emp.getProject().equals("")) {
			emp.setStatus("in stage2");
			emp.setLocationApprover("balaji");
			return "stage2";
		}
		model.addAttribute("emp", emp);
		return "stage1";
	}
	@PostMapping("stage2")
	public String stage2(@ModelAttribute("start") Employee emp,Model model) {
		if(emp.getLocation()!=null && !emp.getLocation().equals("") && emp.getOdc()!=null && !emp.getOdc().equals("")) {
			emp.setStatus("in stage3");
			emp.setFloorAssigner("mahesh");
			return "stage3";
		}
		model.addAttribute("emp", emp);
		return "stage2";
	}
	@PostMapping("stage3")
	public String stage3(@ModelAttribute("start") Employee emp,Model model) {
		if(emp.getFloor()!=null) {
			emp.setStatus("done");
			return "end";
		}
		model.addAttribute("emp", emp);
		return "stage3";
		
	}
}
