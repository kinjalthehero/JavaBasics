package practiceProblems.general;

import java.util.Scanner;

/*
	Exmaple
	1234
	
	remainder=4
	reverse=4
	number=123
	
	remainder=3
	reverse=43
	number=12
	
	remainder=2
	reverse=432
	number=1
	
	remainder=1
	reverse=4321
	number=0

*/

public class General_ReverseNumber {
	
	public static int reverse(int number){
        
		int reverse = 0;
        int remainder = 0;
        
        do {
	        remainder = number % 10;
	        reverse = reverse * 10 + remainder;
	        number = number / 10;
        } while(number > 0);
      
        return reverse;
    }

    public static void main(String args[]) {

    	System.out.println("Please enter number to be reversed using Java program: ");
        int number = new Scanner(System.in).nextInt();
      
        int reverse = reverse(number);
        System.out.println("Reverse of number: " + number + " is " + reverse(number));   
    
    }
}

