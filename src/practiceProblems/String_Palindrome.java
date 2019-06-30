package practiceProblems;

import java.util.Scanner;

public class String_Palindrome {
	
    public static void main(String args[]) {
        
    	String originalString, reversedString = "";
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        originalString = s.nextLine();
        s.close();
        
        int len = originalString.length();
        
        for(int i = len - 1; i >= 0; i--)        
            reversedString = reversedString + originalString.charAt(i);
        
        if(originalString.equalsIgnoreCase(reversedString))
            System.out.println("The string is palindrome.");
        else
            System.out.println("The string is not palindrome.");
    }
}
