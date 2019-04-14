package PracticeProblems;

import java.util.Arrays;

public class Array_RemoveDuplicates {
	
	
	public static int[] removeDuplicate (int[] arr) {
		
		if (arr.length == 0)
			return arr;
		
		Arrays.sort(arr);
		
		// Create a temp result array 
		int[] result = new int[arr.length];
		
		// Add first element from the array
		result[0] = arr[0];
		
		// Make prev variable as the first element
		int prev = arr[0];
		
		for (int i=1; i < arr.length; i++) {
			
			// Check with prev if current element is duplicate
			// If not duplicate then add to the result array
			// Otherwise don't add to the result array
			if (prev != arr[i])
				result[i] = arr[i];
			
			prev = arr[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		// Array with duplicates
		int[] dupArray1 = new int[] {1, 1, 2, 2, 3};
		int[] result = removeDuplicate(dupArray1);
		System.out.println(Arrays.toString(result));
		
		// No elements
		dupArray1 = new int[] {};
		result = removeDuplicate(dupArray1);
		System.out.println(Arrays.toString(result));
		
		// No duplicates
		dupArray1 = new int[] {1,2,3,4,5};
		result = removeDuplicate(dupArray1);
		System.out.println(Arrays.toString(result));
		
	}

}
