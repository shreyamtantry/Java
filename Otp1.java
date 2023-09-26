package com.sangamone;

public class Otp1 {

	public static void main(String[] args) {
		int size=6;
		int qty=2;
		for(int i=0;i<qty;i++) {
			double rand1=Math.random();
			double rand2=rand1*Math.pow(10,size);
			int rand3=(int)rand2;
			System.out.println(rand3);
			
			
		}
		
		
	}

}
