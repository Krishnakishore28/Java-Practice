package com.wipro;

import java.util.Scanner;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		int i=0;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='*') {
				break;
			}
		}
		
		
		for(int j=0;j<i-1;j++) {
			str1+=str.charAt(j);
			
		}
		for(i=i+2;i<str.length();i++) {
			str1+=str.charAt(i);
		}
		System.out.println(str1);
	}

}
