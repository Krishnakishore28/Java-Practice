package com.wipro;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	HashSet<String> set=new HashSet<>(); 
	boolean addCountry(String country) {
		return set.add(country);
	}
	String findCountry(String country) {
		Enumeration<String> countries=Collections.enumeration(set);
		boolean flag=false;
		while(countries.hasMoreElements()) {
			if(country==countries.nextElement()) {
				flag=true;
				break;
			}
		}
		if(flag) {
			return country;
		}
		else {
			return "Country Not Found";
		}
		
	}
	void printAllCountries() {
		Iterator<String> countries=set.iterator();
		while(countries.hasNext()) {
			System.out.println(countries.next());
		}
		
	}
	public static void main(String args[]) {
		HashSetDemo hashSetDemo=new HashSetDemo();
		System.out.println(hashSetDemo.addCountry("india") ? "Added Succesfully" : "Country already present");
		System.out.println(hashSetDemo.addCountry("us") ? "Added Succesfully" : "Country already present");
		System.out.println(hashSetDemo.addCountry("us") ? "Added Succesfully" : "Country already present");
		System.out.println(hashSetDemo.findCountry("india"));
		System.out.println("The Countries are");
		hashSetDemo.printAllCountries();
	}
}
