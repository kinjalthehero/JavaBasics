package practiceProblems.array;

import java.util.Scanner;

public class Array_TargetSumSubarray
{
    // Brute force approach
    public static void solve (int[] arr, int target)
    {
        for (int start = 0; start < arr.length; start++)
        {
            int currSum = 0;

            for (int end = start; end < arr.length; end++)
            {
                currSum += arr[end];

                if (currSum == target) {
                    System.out.println("starting index : " + start + ", " + "Ending index : " + end);
                }
            }
        }
    }

    // O(n) method
    public static void solveEfficient(int[] arr, int target) {

        int start = 0, end = 0;
        int currSum = 0;

        // Review this while condition
        while (start < arr.length && end <= arr.length) {

            // If currSum == taget then print the indices
            if (currSum == target) {
                System.out.println("starting index : " + start + ", " + "Ending index : " + (end - 1));

                // Once indices are printed then increment end for the next loop
                if (end <= arr.length - 1) {
                    currSum += arr[end];
                }
                end++;
            } else {
                // If currSum is higher than target than increment start and remove the start element from the currSum
                if (currSum > target) {
                    currSum -= arr[start];
                    start++;
                }
                else
                {
                    // Add the last element to currSum until sum becomes greater than or equal to target sum
                    if (end <= arr.length - 1) {
                        currSum += arr[end];
                    }
                    end++;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 4, 9, 0, 11};
        solve(arr, 9);
    }
}
