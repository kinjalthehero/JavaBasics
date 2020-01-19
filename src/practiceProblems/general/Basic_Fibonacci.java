package practiceProblems.general;

import java.util.Scanner;

//Java program for Fibonacci number using recursion. 
// Reference: http://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html#ixzz5pB0cEIWh

public class Basic_Fibonacci {

	int[] fib_cache = new int[31];

	public int fib_dynamic_prog(int N)
	{
		if(N <= 1)
			return N;
		else if(fib_cache[N] != 0)
			return fib_cache[N];
		else
			return fib_cache[N] = fib_dynamic_prog(N - 1) + fib_dynamic_prog(N - 2);
	}

	public static int fibonacci(int number){
		if(number == 1 || number == 2)
			return 1; 
		return fibonacci(number-1) + fibonacci(number -2); 
	}
	
	public static int fibonacci2(int number){ 
		
		int fibo1= 1, fibo2= 1, fibonacci= 1;
		
		if(number == 1 || number == 2)
			return 1; 

		for(int i= 3; i<= number; i++){ 
			
			fibonacci = fibo1 + fibo2; 
			fibo1 = fibo2; 
			fibo2 = fibonacci; 
		} 

		return fibonacci; 
	}


	
	public static void main(String args[]) { 
		System.out.println("Enter number upto which Fibonacci series to print: "); 
		int number = new Scanner(System.in).nextInt(); 
		System.out.println("Fibonacci series upto " + number +" numbers : "); 
		
		for(int i=1; i<=number; i++){ 
			System.out.print(fibonacci(i) +" ");
		} 
		
		System.out.println();
		System.out.print(fibonacci2(number) +" ");
	} 
}

		




