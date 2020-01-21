package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int start, int end)
    {
        int mid = start + (end - start) / 2;

        // Divide till we have only 1 element left
        if(start<end) {

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge (int[] arr, int start, int mid, int end) {

        // Make temp array with the length of original array
        int[] temp = new int[arr.length];

        // start from original array’s start location
        int tempIndex = start;

        // left array start index
        int startIndex = start;

        // right array start index
        int midIndex = mid+1;

        while (startIndex <= mid && midIndex <= end) {
            if(arr[startIndex]< arr[midIndex])
                temp[tempIndex++] = arr[startIndex++];
            else
                temp[tempIndex++] = arr[midIndex++];
        }

        while(startIndex <= mid) {
            temp[tempIndex++]=arr[startIndex++];
        }

        while(midIndex <= end) {
            temp[tempIndex++]=arr[midIndex++];
        }

        // copy in the original array at the same indices
        for (int i = start; i <=end; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String args[])
    {
        int  arr[] = {33,-21,45,64,-55,34,11,-8,3,5,1};
        mergeSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}