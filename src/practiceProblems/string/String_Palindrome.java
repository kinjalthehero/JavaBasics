package practiceProblems.string;

import java.util.Scanner;

public class String_Palindrome {

    // Leetcode: https://leetcode.com/problems/palindrome-number/solution/
    public static boolean isPalindrome(String str)
    {
        int start = 0;
        int end = str.length() - 1;

        while(start < end)
        {
            if(str.charAt(start++) != str.charAt(end--))
                return false;
        }

        return true;
    }

    public static boolean isPalindrome_buildString(String originalString) {

        String reversedString = "";

        for(int i = originalString.length() - 1; i >= 0; i--)
            reversedString = reversedString + originalString.charAt(i);

        if(originalString.equalsIgnoreCase(reversedString))
            return true;
        else
            return false;
    }
	
    public static void main(String args[]) {

    	String originalString = "aba";
        System.out.println(isPalindrome(originalString));
        System.out.println(isPalindrome_buildString(originalString));

        originalString = "abb";
        System.out.println(isPalindrome(originalString));
        System.out.println(isPalindrome_buildString(originalString));
    }
}
