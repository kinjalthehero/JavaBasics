package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void sort (int[] arr) {

        if (arr == null || arr.length == 0)
            return;

        quickSort(arr, 0, arr.length-1);
    }

    public static void quickSort(int[] array, int begin, int end) {

        if (begin < end) {
            int pivot = partition(array, begin, end);
            quickSort(array, begin, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    private static int partition(int arr[], int begin, int end) {

        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, end);

        return i+1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String a[]) {
        int[] input = {33,-21,45,64,-55,34,11,-8,3,5,1};
        sort(input);
        System.out.println(Arrays.toString(input));

    }
}