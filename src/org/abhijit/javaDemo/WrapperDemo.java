package org.abhijit.javaDemo;

	//int,float,double (Primitive type) //Integer,Float,Double(Wrapper Classes)

public class WrapperDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		
		int i=27; //Primitive datatype
		
		Integer ii=new Integer(i); //Boxing or Wraping
		System.out.println(ii);	
		
		int j=ii.intValue(); //Unboxing or UnWrapping
		System.out.println(j);	
		
		Integer value=i; //Auto-Boxing
		System.out.println(value);	
		
		int k=value; //Auto-Unboxing	
		System.out.println(k);	
		
		String str= "12345";
		
		int n= Integer.parseInt(str);
		
		System.out.println(n);	
		
		System.out.println("Main Ends");
	}
}
