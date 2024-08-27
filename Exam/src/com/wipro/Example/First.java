package com.wipro.Example;

import java.util.ArrayList;
import java.util.List;

public class First {
	public static void main(String args[]) {
		String s="abcabcbb";
		List<Character> arr=new ArrayList<Character>();
        int left=0,right=0,maxlength=0;
        for(right=0;right<s.length();right++){
            if(!arr.contains(s.charAt(right))){
                arr.add(s.charAt(right));
                maxlength=Math.max(maxlength,right-left+1);
            }
            else{
                while(s.charAt(left)!=s.charAt(right)){
                    arr.remove(s.charAt(left));
                    left++;
                }
                System.out.println(arr+" "+left+" "+right);
                arr.remove(s.charAt(left));
                left++;
                arr.add(s.charAt(right));   
            }
        }
        System.out.println(maxlength);
	}
}
