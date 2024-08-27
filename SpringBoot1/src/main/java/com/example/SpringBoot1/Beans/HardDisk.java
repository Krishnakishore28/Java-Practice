package com.example.SpringBoot1.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HardDisk {
	private int id;
	private String name;
	@Autowired
	private Battery battery;
	public HardDisk() {
		System.out.println("inside harddisk");
	}
	@Override
	public String toString() {
		return "HardDisk [id=" + id + ", name=" + name + ", hardDisk=" + battery + "]";
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
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery hardDisk) {
		this.battery = hardDisk;
	}
	
	
	

}
