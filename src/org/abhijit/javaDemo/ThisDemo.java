package org.abhijit.javaDemo;

class Calc
{
	int n1;
	int n2;
	int result;
	
	public Calc(int n1, int n2)
	{
		//this is uded to refer the instance variables
		
		this.n1=n1;		//n1=n1  ->  0
		this.n2=n2;		//n2=n2  ->  0
		
		//System.out.println("Constructor Executed");
	}
}

public class ThisDemo 
{
	public static void main(String[] args) 
	{
		Calc obj=new Calc(4,3);
		
		System.out.println(obj.n1);
		System.out.println(obj.n2);
	}

}
