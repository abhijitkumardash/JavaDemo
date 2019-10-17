package com.array.basic;

import java.util.*;  

/* Find Smallest Number in Array using Arrays */

public class SmallestInArrayBySort
{  
	public static int getSmallest(int[] a, int total)
	{  

		/* Logic using Collections
			List<Integer> list=Arrays.asList(a);  
			Collections.sort(list);  
			int element=list.get(0);  
			return element; */

		Arrays.sort(a); 
		return a[0]; 
	}  
	public static void main(String args[])
	{  
		int a[]={1,2,5,6,3,2};  
		int b[]={41,42,43,44,66,99,77,33,22,11,55};  

		System.out.println("Smallest: "+getSmallest(a,6));  
		System.out.println("Smallest: "+getSmallest(b,7));  
	}
}


