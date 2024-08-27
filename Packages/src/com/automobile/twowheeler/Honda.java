package com.automobile.twowheeler;

import com.automobile.Vechile;

public class Honda extends Vechile {
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "Honda";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "666";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "Sai";
	}
	public int getSpeed() {
		return 70;
	}
	public void radio() {
		System.out.println("provide facility to control cd inside the car");
	}
	

}
