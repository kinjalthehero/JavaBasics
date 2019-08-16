package practiceProblems.array;

import java.util.HashMap;
import java.util.Map;

public class Array_FindIntersection {

    public static int findIntersection (int[] arr1, int[] arr2)
    {
        int len1 = 0, len2 = 0;

        while (len1 < arr1.length && len2 < arr2.length)
        {
            if (arr1[len1] == arr1[len2])
                return arr1[len1];
            else if (arr1[len1] < arr1[len2])
                len1++;
            else
                len2++;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = { 9, 4, 9, 6};
        int[] arr2 = { 1, 2, 9, 7, 4};
        System.out.println(findIntersection (arr, arr2));
    }
}
