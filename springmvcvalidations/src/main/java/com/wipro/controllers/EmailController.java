package com.wipro.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.controllers.DTO.EmailDto;

@Controller
public class EmailController {
	@Autowired(required=true)
	private MailService mailService;
	@RequestMapping("/email")
	public String emailDisplay(@ModelAttribute("email") EmailDto email,Model model) {
		
		System.out.println(email.getEmail());
		return "email";
	}
	@RequestMapping("/email-process")
	public String emailProcess(@ModelAttribute("email") EmailDto email,Model model,HttpServletRequest request) {
		String newUserName= request.getSession().getAttribute("username")+"Mr";
		model.addAttribute("username", newUserName);
		System.out.println(email.getEmail());
		mailService.sendEmail(email.getEmail(),"friend");
		return "email-process";
	}

}
