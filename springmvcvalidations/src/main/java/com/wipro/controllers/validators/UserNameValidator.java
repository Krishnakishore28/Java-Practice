package com.wipro.controllers.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.wipro.controllers.DTO.Register;

public class UserNameValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Register.class.equals(clazz);
	}
	

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "username.empty","username shouldn't be empty");
		String username=((Register)target).getUsername();
		if(!username.contains("-")) {
			errors.rejectValue("username", "username.not contain -", "must contain atleast one -");
		}
		
		
	}

	
}
