package practiceProblems.array;

public class Array_FindMaxAverage {

    public static int findMaxAverage (int[] num, int k)
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i < k; i++)
            currSum += num[i];

        for (int i = k; i < num.length; i++)
        {
            maxSum = Math.max(maxSum, currSum);

            currSum -= num[i - k];
            currSum += num[i];
        }

        return maxSum/k;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{4, 2, 1, 7, 8, 1}, 3));
    }


}


