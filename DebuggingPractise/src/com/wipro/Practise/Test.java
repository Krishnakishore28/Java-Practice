package com.wipro.Practise;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test());

	}
	public static int test() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==3) {
					return i;
				}
			}
			
		}
		return 0;
	}

}
