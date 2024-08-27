package com.wipro.controllers.DTO;

public class CommunicationDto {
	private String email;
	private PhoneNumberDto phoneNumber;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PhoneNumberDto getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(PhoneNumberDto phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "CommunicationDto [email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	

}
