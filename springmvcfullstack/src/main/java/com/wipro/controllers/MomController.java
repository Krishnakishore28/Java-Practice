package com.wipro.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
	@RequestMapping("/momscafe")
	public String hello() {
		return "mompage";
	}
	@RequestMapping("/ordercompleted")
	public String hello1(@RequestParam("foodordered") String food,Model model) {
		model.addAttribute("food", food);
		System.out.println(food);
		System.out.println(model.getAttribute("order1"));
		model.addAttribute("order1",food);
		return "order";
	}

}
