package practiceProblems.array;

public class Array_Robber {

    public static int rob_orig(int[] nums)
    {
        if(nums.length == 0)
            return 0;

        if(nums.length == 1)
            return nums[0];

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++)
        {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }

        return dp[nums.length-1];
    }

    public static int rob(int[] nums) {

        if (nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        int evenSum = 0, oddSum = 0, i=0, j=1;

        while (i < nums.length) {
            evenSum += nums[i];
            i = i+2;
        }

        while (j < nums.length) {
            oddSum += nums[j];
            j = j+2;
        }

        return Math.max(evenSum, oddSum);


    }

    public static void main(String[] args) {

        int[] housemoney = {2,1,1,2};
        System.out.println(rob_orig(housemoney));
    }
}
