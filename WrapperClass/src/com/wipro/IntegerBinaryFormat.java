package com.wipro;
import java.util.*;
public class IntegerBinaryFormat {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Integer i=sc.nextInt();
		String binary=Integer.toBinaryString(i);
		binary=String.format("Binary equivalent:"+"%0"+(8-binary.length())+"d%s",0,binary);
		if(binary.length()<8) {
			int len=8-binary.length();
			
		}
		System.out.println(binary);
		
	}
}
