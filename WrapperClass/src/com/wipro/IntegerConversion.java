package com.wipro;

public class IntegerConversion {
	public static void main(String args[]) {
		Integer i=Integer.parseInt(args[0]),l=i;
		String binary1="";
		//System.out.println(Integer.toBinaryString(i));
		while(i>0) {
			binary1+=i%2;
			i=i/2;
		}
		String binary="";
		int j=binary1.length()-1;
		while(j>=0) {
			binary+=binary1.charAt(j);
			j--;
		}
		System.out.println("Given number:"+l);
		System.out.println("Binary equivalent:"+binary);
		System.out.println("Octal equivalent:"+Integer.toOctalString(l));
		System.out.println("Hexadecimal equivalent:"+Integer.toHexString(l));
		
	}
}
