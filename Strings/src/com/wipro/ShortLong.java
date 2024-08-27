package com.wipro;
import java.util.*;
public class ShortLong {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		if(str1.length()>str2.length()) {
			System.out.println(str2+str1+str2);
		}
		else {
			System.out.println(str1+str2+str1);
		}
		
	}

}
