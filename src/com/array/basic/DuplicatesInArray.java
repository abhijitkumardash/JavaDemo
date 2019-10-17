package com.array.basic;
import java.util.HashSet;

/* To Find Duplicate Elements In An Array Using HashSet */
public class DuplicatesInArray 
{   
	public static void main(String[] args) 
	{
		String[] str = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};

		HashSet<String> set = new HashSet<String>();

		for (String arrayElement : str)
		{
			if(!set.add(arrayElement))
			{
				System.out.println("Duplicate Element is : "+arrayElement);
			}
		}
	}    
}

/* To Find Duplicate Elements In An Array Using Using Brute Force Method */
/*public class DuplicatesInArray 
{   
    public static void main(String[] args) 
    {
        String[] str = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
 
        for (int i = 0; i < str.length-1; i++)
        {
            for (int j = i+1; j < str.length; j++)
            {
                if( (str[i].equals(str[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+str[j]);
                }
            }
        }
    }    
}*/