package practiceProblems;

import java.util.HashSet;
import java.util.Set;

// A Java program to find if there is a zero sum sub array 	 	  
class Array_SubsetZero { 
      
    static Boolean subArrayExists(int arr[]) { 

    	Set<Integer> hM = new HashSet<Integer>(); 
          
        int sum = 0;      
          
        for (int i = 0; i < arr.length; i++) {  
            sum += arr[i]; 
              
             // If we consider all prefix sums, we can notice that there is a subarray with 0 sum when :
			 // Either a prefix sum repeats or prefix sum becomes 0
            if (arr[i] == 0 || sum == 0 || hM.contains(sum))                          
                return true; 
               
            hM.add(sum); 
        }  
          
        // We reach here only when there is no subarray with 0 sum 
        return false; 
    }      
      
    public static void main(String arg[]) { 
        int arr[] = {-3, 2, 3, 1, 6};
        System.out.println("Found a subarray with 0 sum: " + subArrayExists(arr));
        
        arr = new int[] {4, 2, -3, 1, 6};
        System.out.println("Found a subarray with 0 sum: " + subArrayExists(arr));
        
        arr = new int[] {4, 2, 0, 1, 6};
        System.out.println("Found a subarray with 0 sum: " + subArrayExists(arr));
        
        arr = new int[] {-3, 2, 3, 1, 6};
        System.out.println("Found a subarray with 0 sum: " + subArrayExists(arr));
    }          

}
