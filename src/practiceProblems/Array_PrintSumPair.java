package practiceProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Reference: https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html

public class Array_PrintSumPair {

	/**
     * Dirty way - brute-force	
     * Prints all pair of integer values from given array whose sum is is equal to given number.
     * complexity of this solution is O(n^2)
     */
    public static void printPairs(int[] array, int sum) {

        for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];

                if ((first + second) == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
                }
            }

        }
    }
	
    /**
     * Given an array of integers finds two elements in the array whose sum is equal to n.
     * @param numbers
     * @param n
     */
    public static void printPairsUsingSet_withDuplicatePairs(int[] numbers, int n){
        
    	if(numbers.length < 2) {
            return;
        }   
    	
        Set set = new HashSet(numbers.length);
        
        for(int value : numbers){
            int target = n - value;
            
         /*
          * It will print (5,1) and (1,5) both
          */
         if (set.contains(target))
        	System.out.printf("(%d, %d) %n", value, target);
            
         // Add every value in set
         set.add(value);
       }
    }
    
    /**
     * Given an array of integers finds two elements in the array whose sum is equal to n.
     * @param numbers
     * @param n
     */
    public static void printPairsUsingSet_withoutDuplicatePairs(int[] numbers, int n) {
        
    	if(numbers.length < 2) {
            return;
        } 
    	
        Set set = new HashSet(numbers.length);
        
        for(int value : numbers){
            int target = n - value;
            
	        // Take one number at a time
	        // Compare it with elements in the set for total equal to expected sum
	        // If total is equal to expected sum then print
	        // If not equal to total then add to the set
			if(!set.contains(target)){ 
				 set.add(value); 
			} else {
				System.out.printf("(%d, %d) %n", value, target); 
			}
        }
    }
    
    /*
     * In-place solution
     */
    public static void printPairsUsingTwoPointers(int[] numbers, int k){
        if(numbers.length < 2){
            return;
        }
        Arrays.sort(numbers);
        
        int left = 0; int right = numbers.length -1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == k){
                System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
                left = left + 1;
                right = right -1;
                
            }else if(sum < k){
                left = left +1;
                
            }else if (sum > k) {
                right = right -1;
            }
        }
    }

    
    /*
     * Utility method to find two elements in an array that sum to k.
     */
    public static void prettyPrint(int[] random, int k){
        System.out.println("Random Integer array : " + Arrays.toString(random));
        System.out.println("Sum : " + k);
        System.out.println("pair of numbers from an array whose sum equals " + k);
        
        System.out.println("Expensive way");
        printPairs(random, k);
        
        System.out.println("With Duplicates");
        printPairsUsingSet_withDuplicatePairs(random, k);
        
        System.out.println("Without Duplicates");
        printPairsUsingSet_withoutDuplicatePairs(random, k);
        
        System.out.println();
    }
    
	public static void main(String args[]) {
		
		   int[] arr = {0, 14, 0, 4, 7, 8, 3, 5, 4};
		   int[] arr2 = {1,8,7,12,5,9,1};
	       prettyPrint(arr, 11);
	       prettyPrint(arr2, 6);
	}

}
