package com.automobile.twowheeler;

import com.automobile.Vechile;

public class TestVechile {
	public static void main(String args[]) {
		Hero vechile=new Hero();
		System.out.println(vechile.getModelName());
		System.out.println(vechile.getOwnerName());
		System.out.println(vechile.getRegistrationNumber());
		System.out.println(vechile.getSpeed());
		vechile.radio();
		Honda vechile1=new Honda();
		System.out.println(vechile1.getModelName());
		System.out.println(vechile1.getOwnerName());
		System.out.println(vechile1.getRegistrationNumber());
		System.out.println(vechile1.getSpeed());
		vechile1 .radio();
	}

}
