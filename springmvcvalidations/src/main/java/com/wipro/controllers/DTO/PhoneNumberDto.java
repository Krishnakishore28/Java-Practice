package com.wipro.controllers.DTO;

public class PhoneNumberDto {
	private String countryCode;
	private String phoneNumber;
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public PhoneNumberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return countryCode+"-"+phoneNumber;
	}
	

}
