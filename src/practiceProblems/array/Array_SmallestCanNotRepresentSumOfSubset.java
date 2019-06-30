package practiceProblems.array;

// Find the smallest positive value that cannot be represented as sum of subsets of a given sorted array 	
public class Array_SmallestCanNotRepresentSumOfSubset {

    int findSmallest(int arr[]) { 
        int res = 1;  
  
        /*
         * Traverse the array and increment 'res' if arr[i] is smaller than or equal to 'res'
         * For the first loop, res = 1
         * Element is 1. It can represent res = 1
         * If next element is 2 then res = res + a[i] = 3
         * Now you consider next element 2 with res = 3.
         * If less than or equal to than you continue otherwise return the result
         */
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] <= res)
        		res = res + arr[i];
        	else
        		return res;
        }
        
        return res;
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args)  
    { 
    	Array_SmallestCanNotRepresentSumOfSubset small = new Array_SmallestCanNotRepresentSumOfSubset(); 
        int arr1[] = {1, 3, 6, 10, 11, 15};
        System.out.println(small.findSmallest(arr1)); 
  
        int arr2[] = {1, 1, 1, 1};
        System.out.println(small.findSmallest(arr2)); 
  
        int arr3[] = {1, 1, 3, 4};
        System.out.println(small.findSmallest(arr3)); 
  
        int arr4[] = {1, 2, 5, 10, 20, 40};
        System.out.println(small.findSmallest(arr4)); 
        
        int arr5[] = {1, 2, 3, 4, 5, 6};
        System.out.println(small.findSmallest(arr5)); 

    } 
} 


