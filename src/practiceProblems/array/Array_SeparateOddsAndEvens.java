package practiceProblems.array;

import java.util.Arrays;

public class Array_SeparateOddsAndEvens {

    // Similar to separating 0s and 1s - Method 2
    public static int[] separateOddsAndEvens(int arr[])
    {
        int left = 0;
        int right = arr.length - 1;

        while (left < right)
        {
            // Increment 'left' variable until you get 1’s
            // left variable will be on 1
            while(arr[left] % 2 == 0)
            {
                left++;
            }

            // Decrement right variable until you get 0’s
            // right variable will be on 0
            while(arr[right] % 2 == 1)
            {
                right--;
            }

            // Will place 1 to the right side and 0 to the left side
            if(left < right)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int arr[]={3, 5, 6, 8, 22, 27, 55, 66, 48, 89};
        System.out.println("Original Array: ");

        System.out.println(Arrays.toString(arr));

        separate(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void separate (int[] arr) {

        int left = 0, right = arr.length-1;

        while (left < right) {

            while(arr[left] % 2 == 0)
                left++;

            while(arr[right] % 2 == 1)
                right--;

            if (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            left++;
            right--;
        }
    }
}
