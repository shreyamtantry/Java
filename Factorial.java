package com.sangamone;

import java.util.Scanner;

public class Factorial {

public static void main(String[] args) {
int result=fact(5);
System.out.println("factorial "+result);
}
public static int fact(int n) {
	int factorial=1;
	for(int i=1;i<=n;i++)
	{
	factorial=factorial*i;
	}
	return factorial;
}

}