package PracticeProblems;

import java.util.Scanner;

// Reference: https://www.javatpoint.com/armstrong-number-in-java

/*
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)  
   where:  
   (1*1*1)=1  
   (5*5*5)=125  
   (3*3*3)=27  
   So:  
   1+125+27=153  
 */

public class General_ArmstrongNumber {
	
	public static boolean isArmstrong(int num)  {  
	    
		int newNum=0,remainder,temp;    
	    temp=num;  
	    
	    while(num > 0){  
	    	remainder = num % 10;  
	    	num = num / 10;  
	    	newNum = newNum + (remainder*remainder*remainder);  
	    }  
	    
	    if(temp == newNum)  
	    	return true;   
	    
		return false;  
	}  
	
	public static void main(String args[]){
	    
		System.out.println("Please Enter a number : ");
	    int number = new Scanner(System.in).nextInt();
	    
	    if(isArmstrong(number))
	        System.out.println("Number : " + number + " is a armstrong number");
	    else
	        System.out.println("Number : " + number + " is not a armstrong number");
	}
}  


