package practiceProblems.array;

import java.util.HashMap;
import java.util.Map;

// Reference: https://www.geeksforgeeks.org/non-repeating-element/

public class Array_firstNonRepeatingElement {
	
	static int firstNonRepeating(int arr[]) 
    { 
        for (int i = 0; i < arr.length; i++)
        {
            
        	// NOTICE: Need to create inner variable separately because we will use it outside the inner loop
        	int j; 
        	
        	// If elements are same then ith element has duplicate
        	// COMPLICATED: Here again loop through entire loop starting from 0
            for (j = 0; j < arr.length; j++)
            {
				if (i != j && arr[i] == arr[j]) {
					// Break out of this loop and stop looking at remaining elements
					// Move to the next ith element to check for duplicate
					break;
				}
			}
            
        	// If it doesn't contain duplicate then j will reach till the end of the loop
            // Return ith element because we couldn't find duplicate element in the entire array
            if (j == arr.length) 
                return arr[i]; 
        } 
          
        return -1; 
    } 
	
	/*
	 * Time Complexity: O(n)
	 * Auxiliary Space: O(n)
	 */
	static int firstNonRepeating_usingHashing(int arr[]) 
	{ 
	    
		// Insert all array elements in HashMap 
	    Map<Integer,Integer> m = new HashMap<>();
	    
	    for (int i = 0 ; i < arr.length; i++) { 
	        if(m.containsKey(arr[i])) { 
	            m.put(arr[i], m.get(arr[i])+1); 
	        } 
	        else { 
	            m.put(arr[i], 1); 
	        } 
	    } 
	    
	    // Traverse array again and return first element with count 1 
	    // NOTE: TRAVERSE ARRAY and NOT HASHMAP
	    // HASHMAP are UNORDERED
	    for (int i = 0; i < arr.length; i++) {
		    if (m.get(arr[i]) == 1) 
		            return arr[i]; 
	    }
	    
	    return -1; 
	}
     
    //Driver code 
    public static void main (String[] args) 
    { 
          
        int arr[] = { 9, 4, 9, 6, 7, 4 }; 
          
        System.out.print(firstNonRepeating(arr)); 
        System.out.println();
        System.out.print(firstNonRepeating_usingHashing(arr));
    }

}
