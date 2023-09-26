//Program to create a new text file and type paragraph in it.The contents of text file is executed in the output by separating it to odd and even positions.


package com.sangamone;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S12 {

	public static void main(String[] args) throws IOException {
		
		File s1=new File("new.txt");
Scanner read=new Scanner(s1);
String data=read.nextLine();
data.replaceAll("\\s","");
int len1=data.length();
List<Character> list1=new ArrayList<>();
List<Character> list2=new ArrayList<>();
for(int i=0;i<len1/2;i++) {
list1.add(data.charAt((i*2)+0));
list2.add(data.charAt((i*2)+1));
}
System.out.println("list1="+list1);
System.out.println("list2="+list2);
	}

}
