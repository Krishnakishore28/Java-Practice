package com.wipro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller
public class SessionAttribute {
	@RequestMapping("/fourth")
	public String retur(@org.springframework.web.bind.annotation.SessionAttribute("firstname") String firstname,Model model ) {
		model.addAttribute("firstname",firstname);
		
		return "index";
	}

}
