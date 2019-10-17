package com.array.basic; 

class SmallestLargestElementArray 
{ 
	public static void main(String[] args) 
	{
		//Initialize array  
		int [] arr = new int [] {25, 11, 7, 75, 56, 97};  
		
		//Initialize min with first element of array.  
		int min = arr[0];
		int max = arr[0];
		
		//Loop through the array  
		for (int i = 0; i < arr.length; i++) 
		{  
			//Compare elements of array with min  
			if(arr[i] < min)
			{
				min = arr[i];  
			}
			//Compare elements of array with max 
			if(arr[i] > max)
			{
				max = arr[i];  
			}
		}  
		System.out.println("Smallest element in array: " + min);  
		System.out.println("Maximum element in array: " + max);
	}  
}  
