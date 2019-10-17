package org.abhijit.javaDemo;

public class Constructor 
{
	int a ;
	
	Constructor() 
	{
		System.out.println("constructor executed !!!");
	}

	public static void main(String[] args) 
	{
		System.out.println("main started");
		
		Constructor c1=new Constructor();	//1st Object created
		System.out.println("c1:"+c1);
		
		Constructor c2=new Constructor();	//2nd Object created
		System.out.println("c2:"+c2);
		
		Constructor c3=new Constructor();	//3rd Object created
		System.out.println("c3:"+c3);
		
		System.out.println("main ended");
	}

}
