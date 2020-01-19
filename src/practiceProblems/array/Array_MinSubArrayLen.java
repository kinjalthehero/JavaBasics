package practiceProblems.array;

public class Array_MinSubArrayLen {

    public static int minSubArrayLen (int[] nums, int sum)
    {
        int minLength = Integer.MAX_VALUE;
        int currSum = 0;
        int startIndex = 0;

        for (int endIndex = 0; endIndex < nums.length; endIndex++)
        {
            currSum += nums[endIndex];

            while (currSum >= sum)
            {
                minLength = Math.min(minLength, endIndex - startIndex + 1);
                currSum -= nums[startIndex];
                startIndex++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(new int[]{4, 2, 1, 7, 8, 1}, 16));
    }

}
