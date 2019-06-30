package practiceProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// reference: https://javarevisited.blogspot.com/2012/12/how-to-remove-duplicates-elements-from-ArrayList-Java.html

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
	
	
	public static List<String> removeDuplicates_hashset (String[] arr) {
		
		// Primitive array to ArrayList
		List<String> duplicateList = Arrays.asList(arr);
				      
		//Converting ArrayList to HashSet to remove duplicates
		Set<String> listToSet = new HashSet<String>(duplicateList);
		      
		//Back from Hashset to ArrayList. Without duplicate. 
		List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);
				
		return listWithoutDuplicates;
	}
	
	public static List<String> removeDuplicate_LinkedHashSet (String[] arr) {
		
		//ArrayList with duplicates String
	    List<String> duplicateList = Arrays.asList(arr);
	   
	    // Converting ArrayList to HashSet to remove duplicates
	    Set<String> listToSet = new LinkedHashSet<String>(duplicateList);
	  
	    // Back to ArrayList without duplicate
	    List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);
	 
	    return listWithoutDuplicates;
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
		
		String[] dupArray = {"a", "a", "b", "c", "d"};
		List<String> stringResult = removeDuplicates_hashset(dupArray);
		System.out.println(stringResult);
		
		String[] dupArray2 = {"a", "a", "b", "c", "d"};
		stringResult = removeDuplicate_LinkedHashSet(dupArray2);
		System.out.println(stringResult);
		
	}

}
