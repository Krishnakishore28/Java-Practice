package com.wipro;
import java.util.*;
public class CountryCapital {
	HashMap<String,String> mapObj=new HashMap<String,String>();
	String addCountry(String country,String capital) {
		boolean flag=true;
		String s="";
		s=mapObj.put(country,capital);
		return s;
	}
	String getCapital(String countryName) {
		for(Map.Entry<String,String> entry:mapObj.entrySet()) {
			if(entry.getKey().equals(countryName)) {
				return entry.getValue();
			}
			
		}
		return "No Country found";
	}
	String getCountry(String capital) {
		for(Map.Entry<String,String> entry:mapObj.entrySet()) {
			if(entry.getValue().equals(capital)) {
				return entry.getKey();
			}
			
		}
		return "No Country found";
	}
	Map<String,String> reverseCapitalCountry() {
		Map<String,String> reversing=new HashMap<String,String>();
		for(Map.Entry<String,String> entry:mapObj.entrySet()) {
			reversing.put(entry.getValue(), entry.getKey());
		}
		return reversing;
	}
	List<String> countryList(){
		List<String> arr=new ArrayList<String>();
		for(Map.Entry<String,String> entry:mapObj.entrySet()) {
			arr.add(entry.getKey());
		}
		return arr;
	}
	List<String> capitalList(){
		List<String> arr=new ArrayList<String>();
		for(Map.Entry<String,String> entry:mapObj.entrySet()) {
			arr.add(entry.getValue());
		}
		return arr;
	}
	public static void main(String args[]) {
		CountryCapital test=new CountryCapital();
		System.out.println(test.addCountry("india", "delhi"));
		System.out.println(test.addCountry("india", "new delhi"));
		System.out.println(test.addCountry("japan", "tokiyo"));
		System.out.println(test.getCapital("japan"));
		System.out.println(test.getCountry("new delhi"));
		System.out.println(test.reverseCapitalCountry());
		System.out.println(test.countryList());
		System.out.println(test.capitalList());
	}
	
	

}
