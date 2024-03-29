package com.array.basic;
/* Java program to Convert characters of a string to opposite case */
class ConvertCharacters
{        
     // Method to convert characters  
     // of a string to opposite case 
     static void convertOpposite(StringBuffer str) 
     { 
        int ln = str.length(); 
             
        // Conversion using predefined methods 
        for (int i=0; i<ln; i++) 
        { 
            Character c = str.charAt(i); 
            if (Character.isLowerCase(c)) 
                str.replace(i, i+1, Character.toUpperCase(c)+""); 
            else
                str.replace(i, i+1, Character.toLowerCase(c)+""); 
             
        } 
     } 
       
     public static void main(String[] args)  
     { 
         StringBuffer str = new StringBuffer("AbhijitKumarDash"); 
         // Calling the Method 
         convertOpposite(str); 
           
         System.out.println(str); 
     } 
 }  