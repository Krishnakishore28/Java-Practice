package com.wipro;

public class Employee implements Cloneable{
	int id;
	String name;
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
