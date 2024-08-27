package com.wipro;

import java.util.Date;

public class Employee extends Person{
	
	public Employee(String name, double annualSalary, double year, String nationalInsurance) {
		super(name);
		this.annualSalary = annualSalary;
		this.year = year;
		this.nationalInsurance = nationalInsurance;
	}
	@Override
	public String toString() {
		return "Employee "+"[name="+name+" annualSalary=" + annualSalary + ", year=" + year + ", nationalInsurance=" + nationalInsurance
				+ "]";
	}
	private double annualSalary;
	private double year;
	private String nationalInsurance;
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public double getYear() {
		return year;
	}
	public void setYear(double year) {
		this.year = year;
	}
	public String getNationalInsurance() {
		return nationalInsurance;
	}
	public void setNationalInsurance(String nationalInsurance) {
		this.nationalInsurance = nationalInsurance;
	}
	

}
