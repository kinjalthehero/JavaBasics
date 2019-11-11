package practiceProblems.array;

public class Array_LargestSumSubArray {

    static int maxSubArraySum(int[] nums)
    {
        int n = nums.length;
        //int currSum = nums[0], maxSum = nums[0];
        int currSum = 0, maxSum = 0;

        for(int i = 0; i < n; ++i)
        {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    
    public static void main (String[] args) { 
        
    	int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a)); 
    } 
} 