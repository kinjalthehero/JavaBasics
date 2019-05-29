package PracticeProblems;

import java.util.Scanner;

// Read more: http://www.java67.com/2012/09/palindrome-java-program-to-check-number.html#ixzz5pHW546yC

/**
 * Java program to check if number is palindrome or not.
 * A number is called palindrome if number and its reverse is equal
 * This Java program can also be used to reverse a number in Java
 */
public class General_NumberPalindrome {
	
	public static boolean isPalindrome (int number) {
		
	    int palindrome = number; 
	    int reverse = 0;
	
	    while (palindrome != 0) {
	        int remainder = palindrome % 10;
	        reverse = reverse * 10 + remainder;
	        palindrome = palindrome / 10;
	    }
	
        if (number == reverse)
            return true;
        else
	        return false;
	}
	
	public static void main(String args[]){
	    
		System.out.println("Please Enter a number : ");
	    int palindrome = new Scanner(System.in).nextInt();
	    
	    if(isPalindrome(palindrome))
	        System.out.println("Number : " + palindrome + " is a palindrome");
	    else
	        System.out.println("Number : " + palindrome + " is not a palindrome");
	}
}
	


	


