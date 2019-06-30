package practiceProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Refrence: https://javarevisited.blogspot.com/2012/02/how-to-check-or-detect-duplicate.html#ixzz5lGNj0IIT

public class Array_CheckDuplicate {
	
	public static boolean checkDuplicateElements_brute_force (int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j)
					return true;
			}
		}
		
		return false;
	}
	
    /*
     * detect duplicate in array by comparing size of List and Set
     * since Set doesn't contain duplicate, size must be less for an array which contains duplicates
     */
    public static boolean checkDuplicateElements_set(String[] input){
        // Convert primitive arrays into ArrayList
    	List<String> inputList = Arrays.asList(input);
    	
    	// Pass ArrayList in HashSet constructor
        Set<String> inputSet = new HashSet<>(inputList);
        
        // Check size. If duplicates then hashset will be smaller
        if(inputSet.size()< inputList.size())
            return true;
        
        return false;
    }
    
    /*
     * Since Set doesn't allow duplicates add() return false
     * if we try to add duplicates into Set and this property
     * can be used to check if array contains duplicates in Java
     */
    public static boolean checkDuplicateElements_add(int[] input) {
        Set<Integer> tempSet = new HashSet<>();
        
        // Add elements of the array in Hashset
        // If add function returns false that means array contains duplicate 
        for (Integer element : input) {
            if (!tempSet.add(element)) {
                return true;
            }
        }
        return false;
    }



	
	public static void main (String[] args) {
		
		int[] arr = new int[] {1,2,3,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		System.out.println(checkDuplicateElements_brute_force(arr));
		
		arr = new int[] {1,1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		System.out.println(checkDuplicateElements_brute_force(arr));
		
		arr = new int[] {1,2,3,4,5,6, 6};
		System.out.println(Arrays.toString(arr));
		System.out.println(checkDuplicateElements_brute_force(arr));
		
		arr = new int[] {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		System.out.println(checkDuplicateElements_brute_force(arr));
		
		arr = new int[] {};
		System.out.println(Arrays.toString(arr));
		System.out.println(checkDuplicateElements_brute_force(arr));
		
		arr = new int[] {1,1,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(checkDuplicateElements_brute_force(arr));
		
		String[] string_arr = new String[] {"a","b","c","c","d"};
		System.out.println(Arrays.toString(string_arr));
		System.out.println(checkDuplicateElements_set(string_arr));
		
		string_arr = new String[] {"a","a","b","c","d"};
		System.out.println(Arrays.toString(string_arr));
		System.out.println(checkDuplicateElements_set(string_arr));
		
		string_arr = new String[] {"a","b","c","d","d"};
		System.out.println(Arrays.toString(string_arr));
		System.out.println(checkDuplicateElements_set(string_arr));
		
		string_arr = new String[] {"a","b","c","d","e"};
		System.out.println(Arrays.toString(string_arr));
		System.out.println(checkDuplicateElements_set(string_arr));
		
		string_arr = new String[] {};
		System.out.println(Arrays.toString(string_arr));
		System.out.println(checkDuplicateElements_set(string_arr));
		
		string_arr = new String[] {"a","a","a"};
		System.out.println(Arrays.toString(string_arr));
		System.out.println(checkDuplicateElements_set(string_arr));
		
		arr = new int[] {1,2,3,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		System.out.println(checkDuplicateElements_add(arr));
		
		arr = new int[] {1,1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		System.out.println(checkDuplicateElements_add(arr));
		
		arr = new int[] {1,2,3,4,5,6, 6};
		System.out.println(Arrays.toString(arr));
		System.out.println(checkDuplicateElements_add(arr));
		
		arr = new int[] {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		System.out.println(checkDuplicateElements_add(arr));
		
		arr = new int[] {};
		System.out.println(Arrays.toString(arr));
		System.out.println(checkDuplicateElements_add(arr));
		
		arr = new int[] {1,1,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(checkDuplicateElements_add(arr));
		
	}
}
