package com.wipro.controllers.DTO;

public class Register {
	private String user;
	private String username;
	private String password;
	private String country;
	private String[] hobbies;
	private String gender;
	@Override
	public String toString() {
		return "Register [user=" + user + ", username=" + username + ", password=" + password + ", country=" + country
				+ ", hobbies=" + hobbies + ", gender=" + gender + "]";
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
