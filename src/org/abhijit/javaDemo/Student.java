package org.abhijit.javaDemo;

public class Student
{
	int id;
	String name;
	int age;
	Student(int sid,String sname,int sage)
	{
		id=sid;
		name=sname;
		age=sage;
	}
	
	public static void main(String[] args)
	{
		Student p1 =new Student(7000,"Naresh",22);
		System.out.println("id="+p1.id);
		System.out.println("name="+p1.name);
		System.out.println("age="+p1.age);
	
	

	Student p2 =new Student(8000,"Sameer",22);
	System.out.println("id="+p2.id);
	System.out.println("name="+p2.name);
	System.out.println("age="+p2.age);
	
	

		Student p3 =new Student(9000,"Yasawant",22);
		System.out.println("id="+p3.id);
		System.out.println("name="+p3.name);
		System.out.println("age="+p3.age);
	}
	}	

