package com.wipro.Hibernate4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Car_Details")
@Entity
public class CarDetails {
	@Id
	@Column(name="RegNo")
	private String regNo;
	@Column(name="model")
	private String model;
	@Column(name="color")
	private String color;
	@Column(name="manufacturer")
	private String manufacturer;
	public CarDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "CarDetails [regNo=" + regNo + ", model=" + model + ", color=" + color + ", manufacturer=" + manufacturer
				+ "]";
	}
	
	
}
