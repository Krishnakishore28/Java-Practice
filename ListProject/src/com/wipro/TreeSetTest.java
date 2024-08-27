package com.wipro;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String args[]) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("aishwarya");
		set.add("worst");
		set.add("sumanth");
		set.add("hii");
		Set<String> desending=set.descendingSet();
		System.out.println("After reversing the elements");
		for(String i:desending) {
			System.out.println(i+" ");
		}
		System.out.println("Iteration using iterator");
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("checking if sumanth exits or not");
		iterator=set.iterator();
		boolean flag=false;
		while(iterator.hasNext()) {
			if(iterator.next().equals("sumanth")) {
				System.out.println("sumanth found in the set");
				flag=true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println("sumanth not found in the set");
		}
		
		
		
	}

}
