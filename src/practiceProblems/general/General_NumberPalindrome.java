package practiceProblems.general;

import java.util.Scanner;

public class General_NumberPalindrome {
	
	public static boolean isPalindrome (int number) {

		int palindrome = number;
	    int reverse = 0;

		if(number < 0)
			return  false;

		while (palindrome != 0) {
	        int remainder = palindrome % 10;
	        reverse = reverse * 10 + remainder;
	        palindrome = palindrome / 10;
	    }

		System.out.println("Reversed Number: " + reverse);
	
        if (number == reverse)
            return true;
        else
	        return false;
	}

	// Leetcode: https://leetcode.com/problems/palindrome-number/solution/
	public boolean isPalindrome_UsingString(int x)
	{
		String str = String.valueOf(x);
		int start = 0;
		int end = str.length() - 1;

		while(start < end)
		{
			if(str.charAt(start++) != str.charAt(end--)) return false;
		}

		return true;
	}

	static boolean palindrome (int num) {

		if(num < 0)
			return false;

		int reverse = 0;
		int originalNum = num;

		while (num != 0) {

			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num/10;
		}

		return (originalNum == reverse);
	}
	
	public static void main(String args[]){

	    int palindrome = 121;
	    
	    if(palindrome(palindrome))
	        System.out.println("Number : " + palindrome + " is a palindrome");
	    else
	        System.out.println("Number : " + palindrome + " is not a palindrome");

		palindrome = -121;

		if(palindrome(palindrome))
			System.out.println("Number : " + palindrome + " is a palindrome");
		else
			System.out.println("Number : " + palindrome + " is not a palindrome");

		palindrome = 10;

		if(palindrome(palindrome))
			System.out.println("Number : " + palindrome + " is a palindrome");
		else
			System.out.println("Number : " + palindrome + " is not a palindrome");
	}
}
	


	


