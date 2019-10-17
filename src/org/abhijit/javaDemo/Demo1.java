package org.abhijit.javaDemo;

public class Demo1
{
	public static void main(String[] args) 
	{
			int sp=0,n=1,m=1;
			for(int i=4;i>=1;i--)
			{
				for(int j=1;j<=sp;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(n+"*");
					n++;
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(i*i+m);
					m++;
					if(k!=i)
					{
						System.out.print("*");
					}
				}
				sp+=2;
				System.out.println();
			}
	}

}
