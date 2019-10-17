package com.array.basic;
import java.util.Scanner; 

/* to Sort the Array either in Ascending Order / Descending Order */
public class SortArray
{
	public static void main(String[] args) 
	{
		int n, temp;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
			/*  if (a[i] > a[j]) // for - Ascending Order */
				if (a[i] < a[j]) // for - Descending Order
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.print("Ascending Order:");
		
		for (int i = 0; i < n - 1; i++) 
		{
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n - 1]);
	}
}

/*public class SortArray 
{ 
	public static void main(String[] args) 
	{ 
		// Our arr contains 8 elements 
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 

		Arrays.sort(arr); 							//logic for ascending

		System.out.printf("Modified arr[] : %s", Arrays.toString(arr)); 
	} 
} */

/*public class SortArray 
{ 
    public static void main(String[] args) 
    { 
        // Note that we have Integer here instead of 
        // int[] as Collections.reverseOrder doesn't 
        // work for primitive types. 
        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100}; 

        // Sorts arr[] in descending order 
        Arrays.sort(arr, Collections.reverseOrder()); //logic for ascending

        System.out.printf("Modified arr[] : %s", Arrays.toString(arr)); 
    } 
} */