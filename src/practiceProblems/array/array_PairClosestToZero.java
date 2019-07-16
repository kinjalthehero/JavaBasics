package practiceProblems.array;

import java.util.Arrays;

public class array_PairClosestToZero {

    public static void main(String[] args)
    {
        int array[]={1,30,-5,70,-8,20,-40,60};
        findPairWithMinSumBruteForce(array);
        findPairWithMinSum(array);
    }

    // Method 1
    public static void findPairWithMinSumBruteForce(int arr[])
    {
        if(arr.length<2)
            return;

        int pair1stIndex = 0;
        int pair2ndIndex = 1;
        int minimumSum = arr[0] + arr[1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tempSum = arr[i] + arr[j];

                // Math.abs function will make all numbers positive
                if(Math.abs(tempSum) < Math.abs(minimumSum))
                {
                    pair1stIndex = i;
                    pair2ndIndex = j;
                    minimumSum = tempSum;
                }
            }
        }

        System.out.println(" The pair whose sum is closest to zero using brute force method: "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
    }

    // Method 2
    // Need to understand. Please review later.
    public static void findPairWithMinSum(int arr[]) {

        int sum=0;
        int minimumSum = Integer.MAX_VALUE;

        if(arr.length < 0)
            return;

        Arrays.sort(arr);

        // left and right index variables
        int leftIndex = 0, rightIndex = arr.length-1;

        // variables to keep track of the left and right index pair for minimumSum
        int minLeft = leftIndex, minRight = rightIndex;

        while(leftIndex < rightIndex)
        {
            sum = arr[leftIndex] + arr[rightIndex];

            if(Math.abs(sum) < Math.abs(minimumSum))
            {
                minimumSum = sum;
                minLeft = leftIndex;
                minRight = rightIndex;
            }

            if(sum < 0)
                leftIndex++;
            else
                rightIndex--;
        }

        System.out.println(" The pair whose sum is minimun : "+ arr[minLeft]+" "+ arr[minRight]);
    }
}