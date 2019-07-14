package practiceProblems.array;

import java.util.Arrays;

public class Array_Separate0And1And2 {


    /*Function to sort the given array*/
    public static void sort(int[]a)
    {
        /* keeps the count of 0s, 1s, 2s*/
        // Length is 3 because we are storing 0s, 1s and 2s
        int[]temp = new int[3];

        // Increment corresponding indices
        for(int val : a)
        {
            temp[val]++;
        }

        // Pointer to fill the array
        int pointer = 0;

        for(int i=0; i<temp.length; i++)
        {
            // For 0th index frequency, it will put 0 in the original array
            while(temp[i] > 0)
            {
                a[pointer]=i;
                pointer++;
                temp[i]--;
            }
        }
    }

    // Takes little more time, will review later
    public static void sort2(int[]a)
    {
        // Three pointers to divide the array in designated segments
        int low=0, mid=0, high=a.length-1;

        while(mid <= high)
        {
            /* Case - 1, when element at mid pointer is zero,
             * swap with element at low*/
            if(a[mid]==0)
            {
                a[low]=swap(a[mid], a[mid]=a[low]);
                /* Increment low as well as mid, as we know
                 * the swapped element at mid is a one*/
                low++;
                mid++;
            }
            /* Case - 1, when element at mid pointer is two,
             * swap with element at high*/
            else if(a[mid]==2)
            {
                /* decrement only high and keep mid unchanged, as
                 * we do not know anything about the swapped element
                 * at mid*/
                a[high]=swap(a[mid],a[mid]=a[high]);
                high--;
            }
            else {
                /*Case - 3, when element at mid pointer is one*/
                /*do nothing, and increment mid pointer*/
                mid++;
            }

        }
    }

    /* utility swap function*/
    public static int swap(int i, int j)
    {
        return i;
    }

    // Written by Kinjal Mistry
    public static int[] sort0s1s2s (int[] arr)
    {
        int zeros = 0, ones = 0;
        for (int i=0; i < arr.length; i++)
        {
            if (arr[i] == 0)
                zeros++;
            else if (arr[i] == 1)
                ones++;
        }

        for (int i=0; i < zeros; i++) {
            arr[i] = 0;
        }
        for (int i= zeros; i < (zeros+ones); i++) {
            arr[i] = 1;
        }
        for (int i = (zeros+ones); i < arr.length; i++) {
            arr[i] = 2;
        }

        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {0,1,2,0,1,2,1,2,0,2,2,2,1,0,0,0,1,1,1};

        // No need to return the array and it is pass by reference
        sort0s1s2s(arr);
        String str = Arrays.toString(arr);
        System.out.println(str);

        int[] arr2 = {0,1,2,0,1,2,1,2,0,2,2,2,1,0,0,0,1,1,1};
        sort(arr2);
        String str2 = Arrays.toString(arr2);
        System.out.println(str2);

    }
}
