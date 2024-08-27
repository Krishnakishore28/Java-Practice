package com.wipro.Configuration.Converters;

import org.springframework.core.convert.converter.Converter;

import com.wipro.Configuration.Dto.CreditCardNumber;

public class CreditCardToString implements Converter<CreditCardNumber,String>{

	public String convert(CreditCardNumber source) {
		// TODO Auto-generated method stub
		source.setFirstNumber(1234);
		source.setSecondNumber(8767);
		source.setThirdNumber(6785);
		source.setFourthNumber(1234);
		return source+" uhgbhjb";
	}

}
