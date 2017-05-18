import java.io.*;
import java.util.*;

/*
	More efficient solution, uses a hashmap
	O(n)
*/
public class unique_chars2
{
	public static void main(String args[])
	{
		check_unique_chars("Samuel");
		check_unique_chars("Always");
		check_unique_chars("always");
	}

/*
	Checks whether duplicate characters are present in the inputted string.
	Make all the characters the same case (upper or lower) in the inputted string before calling.
*/
	public static void check_unique_chars(String s)
	{
		HashMap hm = new HashMap<Character, Integer>();
		int flag = 0;
		for(int i = 0; i < s.length(); i++)
		{
			Character c = s.charAt(i);
			if(hm.get(c) == null)
			{
				hm.put(c, 0);
			}
			else
			{
				flag = 1;
				break;
			}	
		}
		if(flag == 1)
		{
			System.out.println("String " + s + " does not have unique characters");
		}
		else
		{
			System.out.println("String " + s + " has unique characters");
		}
		
	}
}