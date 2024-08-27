package com.example.SpringBoot1.Beans;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	private int id;
	private String name;
	public Battery() {
		System.out.println("inside battery");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Battery [id=" + id + ", name=" + name + "]";
	}
	
	

}
