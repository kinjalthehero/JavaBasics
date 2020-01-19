package practiceProblems.array;

import java.util.*;

public class Array_L_RemoveDuplicates
{
    /*public static int removeDuplicates(int[] nums) {
        int i = 0;
        int ptr = i+1;
        while (i < nums.length && ptr < nums.length) {

            if (nums[i] != nums[ptr])
                nums[++i] = nums[ptr];
            else
                ptr++;
        }
        return i+1;
    }*/

    public static int removeDuplicates (int[] arr) {

        int slow = 0, fast = 0;

        while (slow < arr.length && fast < arr.length) {

            if (arr[slow] == arr[fast])
                fast++;
            else {
                slow++;
                arr[slow] = arr[fast];
            }
        }

        return slow+1;
    }

    public static void main (String[] args)
    {
        int[] arr = {0,0,0,1,1,1,2,3,4};
        System.out.println(removeDups(arr));
        System.out.println(Arrays.toString(arr));


        int[] arr2 = {1,1,2};
        System.out.println(removeDups(arr2));
        System.out.println(Arrays.toString(arr2));
    }

    static int removeDups (int[] arr) {

        int slow = 0, fast = 1;

        while (fast < arr.length-1) {

            while (arr[slow] == arr[fast])
                fast++;

            arr[++slow] = arr[fast];
        }

        return slow+1;
    }
}
