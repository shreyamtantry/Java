//program to reverse the number with input given using keyboard

package com.sangamone;

import java.util.Scanner;

public class Reverseno {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int rev=0;
		int rem=0;
		while(n!=0)
		{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		System.out.println("reverse of number="+rev);
if(rev==n)
	System.out.println("The number is palindrome");
else
	System.out.println("The number is not a palindrome");
	
	}

}

