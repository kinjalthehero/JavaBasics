package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int min = i;

            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;

            int smallerNumber = arr[min];
            arr[min] = arr[i];
            arr[i] = smallerNumber;
        }

        return arr;
    }

    public static void main(String a[]){

        int[] arr = {2, -7, -2, -2, 0};
        arr = selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}