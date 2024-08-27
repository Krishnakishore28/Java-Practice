package com.wipro.controllers.CustomEditors;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {
	@Override
	 public void setAsText(String text) {
		 String myConversion=text.toUpperCase();
		 setValue(myConversion);
	 }
	@Override
	public String getAsText() {
		return (String) getValue();
		
	}
	

}
