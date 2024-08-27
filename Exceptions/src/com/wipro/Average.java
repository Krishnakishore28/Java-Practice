package com.wipro;

import java.util.Scanner;

public class Average {
	public static void main(String args[]) throws InvalidMarks {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the names of the students");
		String s1=sc.next();
		String s2=sc.next();
		System.out.println("enter the marks of first student and seconnd student continously");
		try {
			int m11=Integer.parseInt(sc.next());
			int m12=Integer.parseInt(sc.next());
			int m13=Integer.parseInt(sc.next());
			int m21=Integer.parseInt(sc.next());
			int m22=Integer.parseInt(sc.next());
			int m23=Integer.parseInt(sc.next());
			if((m11<0 || m11>100) || (m12<0 || m12>100) || (m13<0 || m13>100) || (m21<0 || m21>100) || (m22<0 || m22>100) || (m23<0 || m23>100)) {
				throw new InvalidMarks("Marks should be in range greater than 0 and less than 100");
			}
			System.out.println("The average marks for first student is "+(m11+m12+m13)/3);
			System.out.println("The average marks for second student is "+(m21+m22+m23)/3);
		}
		catch(NumberFormatException e) {
			System.out.println("The marks should be only numbers");
		}
		
	}
}
