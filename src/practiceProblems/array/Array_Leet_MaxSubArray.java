package practiceProblems.array;

public class Array_Leet_MaxSubArray {

    public static int maxSubArray(int[] nums) {

        if (nums.length == 0)
            return 0;

        int startIndex = 0, endIndex = 0, currSum = nums[startIndex];
        int largestSum = Integer.MIN_VALUE;

        while (startIndex <= endIndex && endIndex < nums.length && startIndex < nums.length) {

            System.out.println("Largest sum: " + largestSum);

            if (currSum > largestSum || startIndex == endIndex) {
                //System.out.println("Start Index: " + startIndex + " End Index: " + endIndex);
                if (currSum > largestSum)
                    largestSum = currSum;
                endIndex++;
                currSum += nums[endIndex];
                System.out.println("currSum: " + currSum);
            }
            else
            {
                //System.out.println("Start Index: " + startIndex + " End Index: " + endIndex);
                currSum -= nums[startIndex];
                startIndex++;
                System.out.println("currSum: " + currSum);
            }

        }

        return largestSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
