package PracticeProblems;

public class General_Factorial {
	
	// Using recursion
	public static int factorial_usingRecursion(int number){       
	
	    if(number == 0)
	        return 1;
	    
	    return number * factorial_usingRecursion(number -1); 
	}

	// Using while loop or iteration
	public static int factorial_usingWhile(int number){
	    
		int result = 1;
	    
		while(number != 0){
	        result = result * number;
	        number--;
	    }
	  
	    return result;
	}
	
	public static void main(String args[]) {
		  
		System.out.println("factorial of 5 using recursion in Java is: " + factorial_usingRecursion(5)); 
		System.out.println("factorial of 6 using iteration in Java is: " + factorial_usingWhile(6)); 
	}

}
