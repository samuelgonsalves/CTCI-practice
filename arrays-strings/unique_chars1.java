import java.io.*;

/*
	Inefficient solution 
	O(n^2)
*/
public class unique_chars1
{
	public static void main(String args[])
	{
		check_unique_chars("Samuel");
		check_unique_chars("Always");
	}

/*
	Checks whether duplicate characters are present in the inputted string.
	Make all the characters the same case (upper or lower) in the inputted string before calling.
*/
	public static void check_unique_chars(String s)
	{
		int flag = 0;
		for(int i = 0; i < s.length(); i++)
		{
			for(int j = i + 1; j < s.length(); j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					flag = 1;
				}
			}
		}
		if (flag == 1)
		{
			System.out.println("String " + s + " does not have unique characters");
		}
		else
		{
			System.out.println("String " + s + " has unique characters");
		}
	}
}