package com.wipro.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.controllers.DTO.FormDTo;
import com.wipro.controllers.DTO.Register;

@Controller
public class HomeController {
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hii this is working";
	}

	/*
	 * @RequestMapping("/") public String home(Model model) { FormDTo user=new
	 * FormDTo(); model.addAttribute("user", user); return "home"; }
	 */

	// ======replacement of aboove method
	@RequestMapping("/")
	public String home(@ModelAttribute("user") FormDTo dto) {

		return "home";
	}

	/*
	 * @RequestMapping("/process-home") public String processHome(FormDTo user,Model
	 * model) { model.addAttribute("username", user.getUsername());
	 * model.addAttribute("crushname", user.getCrushname()); return "process-home";
	 * }
	 */
	// ======replacement of aboove method
	@RequestMapping("/process-home")
	public String processhome(@Valid @ModelAttribute("user") FormDTo user,BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("your input has errors");
		}

		return "process-home";
	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute("register") Register registration) {
		return "register";
	}
	@RequestMapping("/registercompleted")
	public String registerCompleted(@ModelAttribute("register") Register registration) {
		return "register-completed";
	}
	
}
