package org.abhijit.javaDemo;

import java.util.Scanner;

public class Hello2
{
	public static void main(String [] args) 
	{
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scn.nextLine();
		
		@SuppressWarnings("unused")
		char[] ch=str.toCharArray();
		
		int n=4;
		int m=6;
		int o=10;
		
		for (int i = o; i <=0; i++) 
		{
			for (int j = m; j <=m; i++) 
			{
				for (int s = n; s <=0; i++) 
				{
					System.out.println(i+j+s);
				}
			}
		}
	}

}
