package com.wipro;

public class EmployeeTest {
	public static void main(String args[]) throws CloneNotSupportedException {
		Employee e1=new Employee();
		e1.id=1;
		e1.name="suamnth";
		Employee e2=(Employee) e1.clone();
		e1.id=2;
		e1.name="sai";
		System.out.println("Details of cloned");
		System.out.println(e2.id+" "+e2.name);
		System.out.println("Details of original");
		System.out.println(e1.id+" "+e1.name);
		
	}
}
