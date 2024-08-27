package com.wipro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("firstname")
public class SessionAttributesPractise {
	@RequestMapping("first")
	public String first(Model model) {
		model.addAttribute("firstname","sumanth");
		model.addAttribute("secondname","madhav");
		model.addAttribute("next","second");
		return "index";
	}
	@RequestMapping("second")
	public String second(Model model,SessionStatus status) {
		String firstname=(String) model.getAttribute("firstname");
		status.setComplete();
		model.addAttribute("next","third");
		return "index";
	}
	@RequestMapping("/third")
	public String third(Model model) {
		String firstname=(String) model.getAttribute("firstname");
		model.addAttribute("next","fourth");
		return "index";
	}
	

}
