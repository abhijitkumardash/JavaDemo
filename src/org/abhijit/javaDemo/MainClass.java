package org.abhijit.javaDemo;

import java.util.*;

// Interface Operation

interface Operation
{
	void addition(int a,int b);
	void substraction(int a,int b);
	void multiplication(int a,int b);
	void division(int a,int b);
}

// Class Calculator

class Calculator implements Operation
{
	int a,b;
	static String s;	
	public void addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		int c = a+b;
		System.out.println("Addition Result is : "+c);
	}
	public void substraction(int a,int b)
	{
		if (a > b) 
		{
			int c = a-b;
			System.out.println("Substraction Result is : "+c);
		}
		else 
		{
			int c = b-a;
			System.out.println("Addition Result is : "+c);
		}
	}
	public void multiplication(int a,int b)
	{
		int c = a*b;
		System.out.println("Multiplication Result is : "+c);
	}
	public void division(int a,int b)
	{
		if (a > b) 
		{
			int c = a/b;
			System.out.println("Division Result is : "+c);

		} else 
		{
			System.out.println("Denominator is > Numerator");
		}
	}
}

//Class MainClass

class MainClass
{
	public static void main(String[] args) 
	{	
		System.out.println("Main Starts");

		Calculator c1 = new Calculator();

		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);

		System.out.println("Enter which operation you want to perform :");
		System.out.println("for add:1,sub:2,mul:3,div:4");

		int s1=scn.nextInt();

		switch (s1) 
		{
		case 1:

			System.out.print("Enter 1st integer value :");
			int a=scn.nextInt();
			System.out.print("Enter 2nd integer value :");
			int b=scn.nextInt();

			c1.addition(a, b);

			break;
		case 2:

			System.out.print("Enter 1st integer value :");
			int c=scn.nextInt();	
			System.out.print("Enter 2st integer value :");
			int d=scn.nextInt();	

			c1.substraction(c, d);

			break;
		case 3:

			System.out.print("Enter 1st integer value : ");
			int e=scn.nextInt();
			System.out.print("Enter 2st integer value : ");
			int f=scn.nextInt();	

			c1.multiplication(e, f);

			break;
		case 4:

			System.out.print("Enter 1st integer value : ");
			int g=scn.nextInt();	
			System.out.print("Enter 2st integer value : ");
			int h=scn.nextInt();	

			c1.division(g, h);

			break;
		}

		System.out.println("Main Ends");

	}

}
