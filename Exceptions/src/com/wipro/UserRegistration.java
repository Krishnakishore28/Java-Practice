package com.wipro;

public class UserRegistration {
	String userName,UserCountry;
	void registerUser(String username,String userCountry) throws InvalidCountryException {
		if(!userCountry.equals("India")) {
			throw new InvalidCountryException("User Outside India cannot be registered");
		}
		else {
			System.out.println("registration done successfully");
		}
	}
}
