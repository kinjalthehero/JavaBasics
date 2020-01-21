package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort (int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            System.out.print("Iteration "+(i+1)+": ");
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    public static void main(String args[])
    {
        int  arr[]={100,20,15,30,5,75,40};
        bubbleSort(arr);
    }

}
