package com.wipro.config.dto;

public class SignupDto {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SignupDto [username=" + username + ", password=" + password + "]";
	}
	public SignupDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
