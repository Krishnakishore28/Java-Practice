package com.wipro.controllers.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.wipro.controllers.DTO.PhoneNumberDto;

public class PhoneNumberFormatter implements Formatter<PhoneNumberDto>{

	@Override
	public String print(PhoneNumberDto object, Locale locale) {
		// TODO Auto-generated method stub
		return object.getCountryCode()+"-"+object.getPhoneNumber();
	}

	@Override
	public PhoneNumberDto parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		String[] phonenumber=text.split("-");
		System.out.println(phonenumber[0]);
		PhoneNumberDto phone=new PhoneNumberDto();
		int index=text.indexOf('-');
		if(index==-1) {
			phone.setCountryCode("91");
			phone.setPhoneNumber(phonenumber[0]);
		}
		else if(index==0){
			phone.setCountryCode("91");
			phone.setPhoneNumber(phonenumber[1]);
		}
		else {
			phone.setCountryCode(phonenumber[0]);
			phone.setPhoneNumber(phonenumber[1]);
		}
		
		return phone;
	}
	

	
}
