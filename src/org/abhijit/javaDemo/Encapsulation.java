package org.abhijit.javaDemo;

class Students
{
	//Declaring Data Members {"Private"}
	
	private int rollno;	
	private String name;
	
	//Getters & Setters (Which are the Public Methods -> given to the User)
	
	
	//Getter method
	public int getRollno() 
	{
		return rollno;
	}
	
	//Setter method
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	
	//Getter method
	public String getName() 
	{
		return name;
	}
	
	//Setter method
	public void setName(String name) 
	{
		this.name = name;
	}	
}

public class Encapsulation 
{
	public static void main(String[] args) 
	{
		//Object Created !!!
		Students s1=new Students();
		
		//Setter method
		s1.setRollno(108);
		s1.setName("Abhijit");
		
		System.out.println(s1.getName()+" having rollno "+s1.getRollno());
		
		//System.out.println(s1.getName());
	}

}
