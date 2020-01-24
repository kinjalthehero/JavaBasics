package practiceProblems.array;

import java.util.Arrays;

public class Array_PivotIndex {

    static int pivot (int[] arr) {

        int sum = 0;

        for (int a: arr) {
            sum += a;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (leftSum == (sum - leftSum - arr[i])) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;

    }

    public static void main(String[] args) {


        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(pivot(arr));

        int[] arr2 = {1, 2, 3};
        System.out.println(pivot(arr2));
    }
}
