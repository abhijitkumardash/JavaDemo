package org.abhijit.javaDemo;
import java.io.*;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Test 
{
	// Complete the oddNumbers function below.
	static List<Integer> oddNumbers(int l, int r) 
	{
		return null;

	}

	public static void main(String[] args) throws IOException 
	{
		try
		{    		
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			@SuppressWarnings("resource")
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("C:\\Users\\Abhijit Kumar Dash\\Desktop\\Temp.txt")));

			int l = Integer.parseInt(bufferedReader.readLine().trim());

			int r = Integer.parseInt(bufferedReader.readLine().trim());

			List<Integer> res = oddNumbers(l, r);

			bufferedWriter.write(res.stream().map(Object::toString).collect(joining("\n"))+"\n");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
