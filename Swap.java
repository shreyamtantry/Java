package com.sangamone;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
//		a=a+b;//10+20=30
//		b=a-b;//30-20=10
//		a=a-b;//30-10=20
		int temp=0;
		temp=a;//0=10
		a=b;//10=20
		b=temp;//20=10
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
	}

}
