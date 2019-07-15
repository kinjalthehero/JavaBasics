package practiceProblems.array;

import java.util.Scanner;

public class Array_OnesInSortedBinaryArray {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] arr = new int[scn.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("arr[]: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }

        System.out.println(" }");

        System.out.println("Number of 1 in array :"+solveEfficient(0, arr.length-1, arr));

    }

    // Simple approach with time complexity O(n)
    public static int solve(int[] arr)
    {
        int currPointer = 0;

        while (currPointer < arr.length)
        {
            if (arr[currPointer] == 1)
            {
                break;
            }
            currPointer++;
        }

        return (arr.length - currPointer);
    }

    // Approach with time complexity O(log n)
    public static int solveEfficient(int start, int end, int[] arr) {

        // As the array is sorted, we can stop if we encounter 1. Remaining elements would be 1s.
        if (arr[start] == 1) {
            return end - start + 1;
        }

        // If end is 0 then all previous elements are 0s. That means there are no 1s
        if (arr[end] == 0) {
            return 0;
        }

        // Typical divide and conquer
        int mid = (start + end) / 2;

        int leftResult = solveEfficient(start, mid, arr);
        int rightResult = solveEfficient(mid + 1, end, arr);

        return leftResult + rightResult;

    }
}
