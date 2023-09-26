//Calculator program

package com.sangamone;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Prgrm1 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter two nos");
			int num1=scn.nextInt();
			int num2=scn.nextInt();
			int sum=num1+num2;
			int sub=num2-num1;
			double div=(num2/num1);
			int mul=num2*num1;
			List<String>list2=new ArrayList<>();
			list2.add(String.valueOf(sum));
			list2.add(String.valueOf(sub));
			list2.add(String.valueOf(div));
			list2.add(String.valueOf(mul));
			String[] list1={"sum ","diff ","div ","mul "};
			System.out.println(list1[0]+list2.get(0));
			System.out.println(list1[1]+list2.get(1));
			System.out.println(list1[2]+list2.get(2));
			System.out.println(list1[3]+list2.get(3));
		}
	}

}
 