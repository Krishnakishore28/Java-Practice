package com.wipro;
import java.util.*;
public class RemoveX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(str.charAt(0)=='x' || str.charAt(str.length()-1)=='x') {
			System.out.println(str.substring(1,str.length()-1));
		}
		else {
			System.out.println(str);
		}
	}

}
