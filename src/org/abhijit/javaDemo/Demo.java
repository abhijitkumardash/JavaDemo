package org.abhijit.javaDemo;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{
		String s1,s2;
		
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two Strings");
		//taking Input
		s1 = scn.nextLine();
		s2 = scn.nextLine();
		
		//finding the length of each string
		int l1=s1.length();
		int l2=s2.length();
		
		String s3=s1.concat(s2);
		//String s=s1+s2;
		
		System.out.println("Result of Concatination :"+s3);
		
		System.out.println("String 1 Length is :"+l1);
		
		System.out.println("String 2 Length is :"+l2);
		
		s1=s1.toUpperCase();
		System.out.println("1st string to UpperCase: "+s1 );
	}
}
