package org.abhijit.javaDemo;
import java.util.Scanner;

interface Account
{
	void withdraw(int amount);
	void deposit(int amount);
	void checkbal();
}

class Savings implements Account
{
	String accName;
	double bal;
	long accNo;
	//Savings class constructor
	Savings(String accName,double bal,long accNo)
	{
		this.accName=accName;
		this.accNo=accNo;
		this.bal=bal;
	}

	public void withdraw(int amount)
	{
		this.bal=this.bal-amount;
		System.out.println("amount withdrawn is"+amount);
		System.out.println("The Savings Account current balance is: "+this.bal);
	}
	public void deposit(int amount)
	{
		this.bal=this.bal+amount;
		System.out.println("amount Deposited is"+amount);
		System.out.println("The Savings Account current balance is: "+this.bal);
	}
	public void checkbal()
	{
		System.out.println("The Savings Account Current balance is: "+this.bal);
	}
}

class Loans implements Account
{
	String accName;
	double bal;
	long accNo;
	//Loans class constructor
	Loans(String accName,double bal,long accNo)
	{
		this.accName=accName;
		this.accNo=accNo;
		this.bal=bal;
	}

	public void withdraw(int amount)
	{
		this.bal=this.bal+amount;

		System.out.println("amount withdrawn is:"+amount);
		System.out.println("The Savings Account current balance is: "+this.bal);
	}
	public void deposit(int amount)
	{
		this.bal=this.bal-amount;

		System.out.println("amount Deposited is:"+amount);
		System.out.println("The Savings Account current balance is: "+this.bal);
	}
	public void checkbal()
	{
		System.out.println("The Savings Account Current balance is: "+this.bal);
	}
}

class AccountManager
{
	public static Account createAccount(String accName,double bal,long accNo,char ch)
	{
		if(ch=='s'||ch=='S')
		{
			Savings s= new Savings(accName, bal,accNo);
			System.out.println("Savings Account Created, Thank You");
			return s;
		}
		else 
		{
			Loans l= new Loans(accName, bal,accNo);
			System.out.println("Loans Account Created, Thank You");	
			return l;
		}
	}
}
public class User 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Account type");
		char ch=sc.next().charAt(0);

		System.out.println("Enter Account name");
		String accName=sc.nextLine();
		sc.nextLine();

		System.out.println("Enter Account balance");
		double bal=sc.nextDouble();

		System.out.println("Enter Account number");
		long accNo=sc.nextLong();

		Account ref=AccountManager.createAccount(accName,bal,accNo,ch);

		System.out.println("What do you want to do?");
		System.out.println("press 1 for checking current balance");
		System.out.println("press 2 for Withdrawing amount");
		System.out.println("press 3 for Depositing amount");

		int val=sc.nextInt();

		if(val==1)
		{
			ref.checkbal();
		}
		else if(val==2)
		{
			System.out.println("Enter amount to withdraw");
			int amount=sc.nextInt();
			ref.withdraw(amount);
		}
		else if(val==3)
		{
			System.out.println("Enter amount to Deposited");
			int amount=sc.nextInt();
			ref.deposit(amount);
		}
		else
		{
			System.out.println("GO LEARN NUMBERS");
			ref.checkbal();
		}
		System.out.println("Tracnsaction Completed");
	}

}
