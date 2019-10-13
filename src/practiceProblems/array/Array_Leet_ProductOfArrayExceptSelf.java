package practiceProblems.array;

public class Array_Leet_ProductOfArrayExceptSelf
{
    public int[] productExceptSelf(int[] nums)
    {
        int[] result = new int[nums.length];

        // Calculate lefts and store in result.
        int left = 1;

        for (int i = 0; i < nums.length; i++)
        {
            if (i > 0)
                left = left * nums[i - 1];

            result[i] = left;
        }

        // Calculate rights and the product from the end of the array.
        int right = 1;

        for (int i = nums.length - 1; i >= 0; i--)
        {
            if (i < nums.length - 1)
                right = right * nums[i + 1];

            result[i] *= right;
        }

        return result;
    }
}