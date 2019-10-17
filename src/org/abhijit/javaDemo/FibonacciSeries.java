package org.abhijit.javaDemo;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=scn.nextInt();
        int a=0; int b=1; int c;
        
        // System.out.println(a+" "+b);
        for (int i = 1; i <= n; i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;   
            b=c;   
        }
	}

}
