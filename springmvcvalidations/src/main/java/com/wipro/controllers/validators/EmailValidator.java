package com.wipro.controllers.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.wipro.controllers.DTO.Register;

public class EmailValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Register.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		String email=((Register)target).getCommunicationDto().getEmail();
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDto.email", "email.empty","email shouldn't be empty");
		
		if(!email.endsWith("seleniumexpress")) {
			errors.rejectValue("communicationDto.email", "must contain selenium", "must end with selenium.express");
		}
		
	}

}
