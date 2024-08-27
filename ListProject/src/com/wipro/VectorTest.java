package com.wipro;
import java.util.*;
public class VectorTest {
	public static void main(String args[]) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		Iterator<Integer> i=vector.iterator();
		System.out.println("The Elements in array");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
