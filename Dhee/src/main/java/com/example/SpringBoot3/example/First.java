package com.example.SpringBoot3.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class First {
	@ResponseBody
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String example() {
		return "hii";
	}
}
