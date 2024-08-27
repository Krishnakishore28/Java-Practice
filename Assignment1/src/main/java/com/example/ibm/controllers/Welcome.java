package com.example.ibm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Welcome {
	@GetMapping("/bankName")
	public String bankName() {
		return "HDFC BANK";
	}
	@GetMapping("/bankaddress")
	public String bankAddress() {
		return "Church Street,Banglore";
	}
}
