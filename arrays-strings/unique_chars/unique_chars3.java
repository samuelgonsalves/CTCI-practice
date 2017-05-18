import java.io.*;
import java.util.*;

/*
	Bit vector implementation (assuming characters between 'a' and 'z')
	O(n)
	Space efficient
*/
public class unique_chars3
{
	public static void main(String args[])
	{
		check_unique_chars("samuel");
		check_unique_chars("always");
	}

/*
	Checks whether duplicate characters are present in the inputted string.
	Make all the characters the same case (upper or lower) in the inputted string before calling.
*/
	public static void check_unique_chars(String s)
	{
		int check = 0, flag = 0;
		for(int i = 0; i < s.length(); i++)
		{
			int value = s.charAt(i) - 'a';
			if((check & (1 << value)) > 0)
			{
				flag = 1;
				break;
			}
			else
			{
				check |= (1 << value);
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