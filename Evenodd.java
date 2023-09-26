//To separate even and odd characters using a method

package com.sangamone;

import java.util.ArrayList;
import java.util.List;

public class Evenodd {

	public static void main(String[] args) {
		fun1("funwithprogramming");
		fun1("shreyatantry");
		fun1("ananyadmayya");
		
		
		
		

	}
	public static String fun1(String s1) {
        
		
		List<Character> list1=new ArrayList<>();
		List<Character> list2=new ArrayList<>();
		int len1=s1.length();
		System.out.println("s1="+s1);
		System.out.println("length of s1="+len1);
		for(int i=0;i<len1/2;i++) {
			list1.add(s1.charAt(i*2));
			list2.add(s1.charAt(i*2+1));
		}
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		return "hello"; 
	}
	

}
