package practiceProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Delete {

    static int firstNonRepeating(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {

            // Need to create inner variable separately because we will use it outside the inner loop
            int j;

            // Now compare ith element with all other element in the array
            for (j = 0; j < arr.length; j++)
            {
                // If elements are same then ith element has duplicate
                if (i != j && arr[i] == arr[j])
                {
                    // Break out of inner loop
                    // Move to the next ith element to check for duplicate
                    break;
                }
            }

            // If it doesn't contain duplicate then j will increment to arr.length (which is +1 compared to arr.length-1 from the for loop length)
            // Return ith element because we couldn't find duplicate element in the entire array
            if (j == arr.length)
                return arr[i];
        }

        return -1;
    }

    public static void main(String args[])
    {
        int arr1[] = { 9, 4, 9, 6, 7, 4 };;
        System.out.println(firstNonRepeating(arr1));

    }
}

