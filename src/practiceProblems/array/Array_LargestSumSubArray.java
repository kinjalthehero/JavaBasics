package practiceProblems.array;

public class Array_LargestSumSubArray {

    static int maxSubArraySum(int arr[]) { 

        int largestSum = Integer.MIN_VALUE;
        int max = 0; 

        for (int i = 0; i < arr.length; i++) { 
            
        	max = max + arr[i]; 
            
            if (largestSum < max) 
                largestSum = max; 
            
            if (max < 0) 
                max = 0; 
        } 
        
        return largestSum; 
    } 
    
    public static void main (String[] args) { 
        
    	int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a)); 
    } 
} 