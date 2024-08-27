package com.automobile.twowheeler;

import com.automobile.Vechile;

public class Hero extends Vechile{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Hero";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "562";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Smanth";
	}
	public int getSpeed() {
		return 50;
	}
	public void radio() {
		System.out.println("provide facility to control the radio device");
	}
	

	
}
