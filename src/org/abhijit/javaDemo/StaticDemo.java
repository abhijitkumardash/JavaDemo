package org.abhijit.javaDemo;

class Employ
{
	int id;
	int salary;
	static String ceo;		//this variable will be equal to each object
							//ceo is same for all the objects !!! 
	
	static 					//when U load a Class (Only Once)
	{
		ceo="lara";
	}
	
	
	public void show()
	{
		System.out.println(id+":"+salary+":"+ceo);
	}
}

public class StaticDemo 
{
	public static void main(String[] args) 
	{
		Employ abhijit=new Employ();
		
		//abhijit's Data
		
		abhijit.id=108;
		abhijit.salary=40000;
		
		////Employ.ceo="Mukesh";
		
		Employ rahul=new Employ();
		
		//rahul's Data
		
		rahul.id=110;
		rahul.salary=50000;
		
		////Employ.ceo="Rakesh";
		
		////Employ.ceo="Rakesh";
		
		abhijit.show();
		rahul.show();
		
	}

}
