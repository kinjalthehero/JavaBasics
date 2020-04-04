package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            int curr = arr[i];
            int j;

            // If we get smaller value than curr then stop at that index
            for (j = i; j > 0 && arr[j - 1] > curr; j--) {

                arr[j] = arr[j - 1]; // move to the right
            }

            // Found the exact location to insert
            // We will put curr at that index
            arr[j] = curr;
        }

        return arr;
    }

    public static void main(String args[])
    {
        int  arr[]={100,20,15,30,5,75};
        insertionSort(arr);
    }

}
