//Program to reverse the string

package com.sangamone;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String name=scan.nextLine();
		int length=name.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		
		System.out.println("reverse of string="+rev);
		if(rev==name)
			System.out.println("The string is palindrome");
		else
			System.out.println("The string is not a palindrome");
		

	}

};
