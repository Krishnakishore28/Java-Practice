package com.wipro;

public class AgeExceptionTest {
	public static void main(String args[]) throws AgeException {
		String name=args[0];
		int age=Integer.parseInt(args[1]);
		if((!(age>=18 && age<=60))){
			throw new AgeException("Age should be between between 18 and 60");
		}
		System.out.println("User added");
		
	}
}
