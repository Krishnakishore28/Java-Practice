package com.wipro;

import java.util.Scanner;

public class UserRegistrationTest {
	public static void main(String args[]) throws InvalidCountryException {
		UserRegistration user=new UserRegistration();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name and country");
		String name=sc.next();
		String country=sc.next();
		user.registerUser(name, country);
		
	}
}
