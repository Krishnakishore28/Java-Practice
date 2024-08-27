package com.wipro.Hibernate4;

public class Dto {
	private int regNo;
	private String manufacturer;
	public Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Dto [regNo=" + regNo + ", manufacturer=" + manufacturer + "]";
	}
	
}
