package com.wipro.Configuration.Formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.wipro.Configuration.Dto.CreditCardNumber;

public class CreditCardFormatters implements Formatter<CreditCardNumber>{

	public String print(CreditCardNumber object, Locale locale) {
		// TODO Auto-generated method stub
		
		return object.getFirstNumber()+"-"+object.getSecondNumber()+"-"+object.getThirdNumber()
		+"-"+object.getFourthNumber();
	}

	public CreditCardNumber parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		String[] arr=text.split("-");
		CreditCardNumber creditCardNumber=new CreditCardNumber();
		creditCardNumber.setFirstNumber(Integer.parseInt(arr[0]));
		creditCardNumber.setSecondNumber(Integer.parseInt(arr[1]));
		creditCardNumber.setThirdNumber(Integer.parseInt(arr[2]));
		creditCardNumber.setFourthNumber(Integer.parseInt(arr[3]));
		return creditCardNumber;
	}
	

}
