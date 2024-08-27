package com.wipro.config.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
import com.wipro.config.Repo.SignupRepo;
import com.wipro.config.Repo.SignupRepoImpl;
import com.wipro.config.dto.SignupDto;

@Controller
public class SecurityController {
	@Autowired
	private SignupRepoImpl repo;
	
	@ResponseBody
	@GetMapping("/bye")
	public String bye() {
		return "bye";
	}
	@GetMapping("welcome")
	public String welcome() {
		return "hello";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/")
	public String logout(Authentication auth,Principal p,Model model) {
		String user=p.getName();
		java.util.Collection<? extends GrantedAuthority> authorities= auth.getAuthorities();
		model.addAttribute("user", user);
		model.addAttribute("auth", authorities);
		return "logout";
	}
	@GetMapping("signup")
	public String signup(@ModelAttribute("signup") SignupDto signupDto) {
		
		return "signup";
	}
	@GetMapping("/trainer")
	public String train() {
		return "trainer";
	}
	@GetMapping("/coder")
	public String coder() {
		return "Coder";
	}
	@GetMapping("/error")
	public String error() {
		return "error";
	}
	@PostMapping("processsignup")
	public String process(SignupDto signupDto) {
		repo.save(signupDto);
		return "redirect:bye";
	}
	
	
}
