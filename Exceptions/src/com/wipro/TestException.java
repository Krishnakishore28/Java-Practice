package com.wipro;
import java.util.*;
public class TestException {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++) {
			try {
				arr[i]=Integer.parseInt(sc.next());
			}
			catch(NumberFormatException e){
				System.out.println(e.getClass());
			}
		}
		System.out.println("Enter the index of array you want to access");
		int index=sc.nextInt();
		try {
			System.out.println("The array element at index "+index+" = "+arr[index]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getClass());
		}
		
			
	}
}

