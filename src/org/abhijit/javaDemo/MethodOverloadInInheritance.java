package org.abhijit.javaDemo;

public class MethodOverloadInInheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Demo12 D12 = new Demo12();
		
		D12.name1();
		D12.name1(30);
		
		System.out.println("Main Ends");
	}
}
class Demo11
{
	public void name1() 
	{
		System.out.println("This is the name1() of Demo11");
	}
}
class Demo12 extends Demo11
{
	public void name1(int a) 
	{
		a=20;
		System.out.println("This is the name1(int a) of Demo12  "+a);
	}
}
