package com.wipro;
import java.util.*;
public class HalfString {
	public static void main(String args[]) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		if(str.length()%2==0) {
			System.out.println(str.substring(0,str.length()/2));
		}
		else {
			str=null;
			System.out.println(str);
			
		}
	}

}
