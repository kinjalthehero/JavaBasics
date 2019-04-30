package PracticeProblems;

/* Java program to find first repeating element in arr[] 
 * https://java2blog.com/find-first-repeating-element-array-integers/
 */

import java.util.*; 

// Reference: https://www.geeksforgeeks.org/find-first-repeating-element-array-integers/
 
public class Array_FirstRepeatingElement 
{  
	
	static int getFirstRepeatingElement_bruteForce (int[] arr) {
		
		for (int i=0; i < arr.length; i++) {
			for (int j=i+1; j < arr.length; j++ )
				if (arr[i] == arr[j])
					return i;
		}
		
		return -1;
	}
	
	static int getFirstRepeatingElementArray(int array[]) { 
		
		int minimumIndex = -1; 
 
		// HashSet - Unordered and no duplicates 
		HashSet<Integer> set = new HashSet<>(); 
 
		/* 
		 * Iterate from right to left because we need to find first repeating element
		 * We will find and keep on decrementing repeating element's index
		 * Last index of the loop would be first repeating element of the array 
		 */
		for (int i=array.length-1; i>=0; i--) 
		{ 
			// If set contains the element, update minimum index 
			if (set.contains(array[i])) 
				minimumIndex = i; 
 
			else   // Else add element to hash set 
				set.add(array[i]); 
		} 
		return minimumIndex;
	} 
 
	public static void main (String[] args) throws java.lang.Exception 
	{ 
		int array[] = {10, 7, 8, 1, 8, 7, 6}; 
		int min=getFirstRepeatingElementArray(array); 
		 
		if (min != -1) 
			System.out.println("The first repeating element in array is " + array[min]); 
		else
			System.out.println("There are no repeating elements"); 
		
		
		min=getFirstRepeatingElement_bruteForce(array); 
		 
		if (min != -1) 
			System.out.println("The first repeating element in array is " + array[min]); 
		else
			System.out.println("There are no repeating elements"); 
	} 
} 
