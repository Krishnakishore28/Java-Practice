package com.wipro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class MailService {
	@Autowired(required=true)
	private JavaMailSender javaMailSender;
	public void sendEmail(String email,String relation) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo("mbvsumanth@gmail.coml");
		message.setSubject("Love Calculator");
		message.setText("Hi The relation is "+relation);
		javaMailSender.send(message);
		
	}

}
