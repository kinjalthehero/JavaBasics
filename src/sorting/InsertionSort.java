package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++)
        {
            int valueToSort = arr[i];
            int j;

            // If we get smaller value than valueToSort then , we stop at that index.
            for ( j = i; j > 0 && arr[j - 1] > valueToSort; j--) {
                arr[j] = arr[j - 1];
            }

            // We will put valueToSort at that index
            arr[j] = valueToSort;
            System.out.print("Iteration "+(i)+": ");
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    public static void main(String args[])
    {
        int  arr[]={100,20,15,30,5,75};
        insertionSort(arr);
    }

}
