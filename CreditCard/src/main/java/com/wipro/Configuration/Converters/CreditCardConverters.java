package com.wipro.Configuration.Converters;

import org.springframework.core.convert.converter.Converter;

import com.wipro.Configuration.Dto.CreditCardNumber;

public class CreditCardConverters implements Converter<String,CreditCardNumber>{

	public CreditCardNumber convert(String source) {
		String[] arr=source.split("-");
		CreditCardNumber creditCardNumber=new CreditCardNumber();
		creditCardNumber.setFirstNumber(Integer.parseInt(arr[0]));
		creditCardNumber.setSecondNumber(Integer.parseInt(arr[1]));
		creditCardNumber.setThirdNumber(Integer.parseInt(arr[2]));
		creditCardNumber.setFourthNumber(Integer.parseInt(arr[3]));
		
		return creditCardNumber;
	}

}
