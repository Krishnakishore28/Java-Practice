 package com.wipro;
import java.util.*;
public class RepeatString {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		str=str.substring(str.length()-n);
		str=str.repeat(n);
		System.out.println(str);
	}

}
