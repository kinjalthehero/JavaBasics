package practiceProblems.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_UnionAndIntersection {
 
	private static void unionAndIntersectionOfTtwoSortedArrays(int[] arr1, int[] arr2) {
		
		String union = "";
	    String intersection = "";
	     
	    int i=0; 
	    int j=0;
	    
	    // Loop with any of the array ends
	    while(i < arr1.length && j < arr2.length) {

	    	// If both elements are equal then add in both union and intersection
		    if(arr1[i] == arr2[j]){
		    	
		    	union += arr1[i] + " ";
		    	intersection += arr1[i] + " "; 
		    	i++; 
		    	j++;
		    }
		    
		    // If less than arr2 than add in union and increment arr1
		    else if(arr1[i] < arr2[j]) {
		    	union += arr1[i] + " ";
		    	i++;
		    } 
		    
		    // else add in union and increment arr2
		    else {
		    	union += arr2[j] + " ";
		    	j++;
		    }
	    }
	     
	    // Add remaining elements
	    while(i < arr1.length){
	    	union += arr1[i];
	    	i++;
	    }
	      
	    while(j < arr2.length) {
	    	union += arr2[j];
	    	j++;
	    }
	     
	    System.out.println("union :"+union);
	    System.out.println("intersection :"+intersection);
	}
	
	public static int[] intersectionUsingHashSet(int[] arr1, int[] arr2) {
	    
		// Add all elements from arr1 in set1
		Set<Integer> set1 = new HashSet<Integer>();
	    for(int i: arr1){
	        set1.add(i);
	    }
	 
	    // Check if element from arr2 is present in set1
	    // If present then don't add
	    Set<Integer> set2 = new HashSet<Integer>();
	    
	    for(int i: arr2){
	        if(set1.contains(i)){
	            set2.add(i);
	        }
	    }
	 
	    int[] result = new int[set2.size()];
	    int i=0;
	    for(int n: set2){
	        result[i++] = n;
	    }
	 
	    return result;
	}
	  
	public static void main(String[] args) {
		int arr1[] = {10, 15, 22, 80};
	    int arr2[] = {5, 10, 11, 22, 70, 90}; 
	    unionAndIntersectionOfTtwoSortedArrays(arr1, arr2);
	    System.out.println("Just intersection using HashSet :" + Arrays.toString(intersectionUsingHashSet(arr1, arr2)));
	    
	}
}

