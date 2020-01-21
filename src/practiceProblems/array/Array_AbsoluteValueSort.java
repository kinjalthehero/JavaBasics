package practiceProblems.array;

import java.util.Arrays;

public class Array_AbsoluteValueSort {

    public static int[] selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            // Assume current element’s index as smallest
            int min = i;

            // Find index of smallest element in rest of the array
            for (int j = i + 1; j < arr.length; j++)
                if (Math.abs(arr[j]) < Math.abs(arr[min])) {
                    min = j;
                } else if (Math.abs(arr[j]) == Math.abs(arr[min])) {
                    if (arr[j] < arr[min])
                        min = j;
                }

            // swap arr[min] and arr[i]
            int smallerNumber = arr[min];
            arr[min] = arr[i];
            arr[i] = smallerNumber;
        }

        return arr;
    }

    public static void main(String a[]){

        int[] arr = {-7,-2,-2,6,5,-6,-2,-6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
