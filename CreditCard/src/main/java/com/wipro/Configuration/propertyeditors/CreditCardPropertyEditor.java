package com.wipro.Configuration.propertyeditors;

import java.beans.PropertyEditorSupport;

import com.wipro.Configuration.Dto.CreditCardNumber;

public class CreditCardPropertyEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] arr=text.split("-");
		CreditCardNumber creditCardNumber=new CreditCardNumber();
		creditCardNumber.setFirstNumber(Integer.parseInt(arr[0]));
		creditCardNumber.setSecondNumber(Integer.parseInt(arr[1]));
		creditCardNumber.setThirdNumber(Integer.parseInt(arr[2]));
		creditCardNumber.setFourthNumber(Integer.parseInt(arr[3]));
		
		setValue(creditCardNumber);
	}
	@Override
	public String getAsText() {
		
		return (String)getValue();
	}

}
