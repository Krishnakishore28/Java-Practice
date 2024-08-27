package com.wipro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/")
	public String welcome(Model model) {
		
		model.addAttribute("marks", new Marks());
		
		return "Welcome";
	}
	@RequestMapping("/process")
	public String process(@ModelAttribute("marks") Marks marks,Model model) {
		int sum=marks.getEnglish()+marks.getScience()+marks.getMaths();
		model.addAttribute("sum", sum);
		return "process";
		
	}
	

}
