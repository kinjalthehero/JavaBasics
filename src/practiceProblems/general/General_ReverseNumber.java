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

    public static int reverse_withNegative(int number)
    {
        // IMPORTANT: Make reversedNumber long to handle overflow. We will store overflow value here and then later check
        long reversedNumber = 0;
        System.out.println("Original number: " + number);

        while (number != 0)
        {
            reversedNumber = reversedNumber * 10 + number % 10;
            System.out.println(reversedNumber);
            number = number / 10;
        }

        // We might get overflow long value
        // If it is less than min or greated than max then return error, 0, or -1 based on the requirement
        if (reversedNumber < Integer.MIN_VALUE || reversedNumber > Integer.MAX_VALUE)
            return 0;
        else
            return (int)reversedNumber;
    }

    public static void main(String args[]) {

        int number = 1200;
        //System.out.println("Reverse of number: " + number + " is " + reverse(number));
        System.out.println("Reverse of number: " + number + " is " + reverse_withNegative(123));
        System.out.println("Reverse of number: " + number + " is " + reverse_withNegative(-123));
        System.out.println("Reverse of number: " + number + " is " + reverse_withNegative(120));

        // Overflow case
        System.out.println("Reverse of number: " + number + " is " + reverse_withNegative(1000000003));
    }
}

