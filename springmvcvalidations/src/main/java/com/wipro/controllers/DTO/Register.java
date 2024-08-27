package com.wipro.controllers.DTO;

import java.util.Arrays;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.wipro.controllers.validators.Age;

public class Register {
	@NotEmpty(message="{String.empty}")
	private String user;
	private String username;
	private String password;
	private String country;
	private String[] hobbies;
	private String gender;
	private CommunicationDto communicationDto;
	@Age(lower=18,upper=70)
	private Integer age;
	public CommunicationDto getCommunicationDto() {
		return communicationDto;
	}
	public void setCommunicationDto(CommunicationDto communicationDto) {
		this.communicationDto = communicationDto;
	}
	
	@Override
	public String toString() {
		return "Register [user=" + user + ", username=" + username + ", password=" + password + ", country=" + country
				+ ", hobbies=" + Arrays.toString(hobbies) + ", gender=" + gender + ", communicationDto="
				+ communicationDto + ", age=" + age + "]";
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}
