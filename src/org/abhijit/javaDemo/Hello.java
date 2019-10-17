package org.abhijit.javaDemo;

import java.util.Scanner;

public class Hello
{
	public static void main(String [] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		
		char[] ch=str.toCharArray();
		@SuppressWarnings("unused")
		String str1="";
		
		for (int i = ch.length-1; i >=0; i--) 
		{
			int k=1;
			
			while (ch[i]!=' ') 
			{
				i--;
			}
			
			int j=i+1;
			
			while (j<=k) 
			{
				str1+=ch[i];
				j++;
			}
			
			str1+=" ";
		}	
	}
}
