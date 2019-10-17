package org.abhijit.javaDemo;

class C 
{
	C()
	{
		System.out.println("C class 1st_Constructor");
	}
	protected C(int i)
	{
		System.out.println("C class 2nd_Constructor");
	}
}

class B extends C
{
	B()
	{
		super(20);
		System.out.println("B class Constructor");
	}
}

public class A
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		B b = new B();
	}
}