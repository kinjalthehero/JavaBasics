package practiceProblems.array;

import java.util.Arrays;

public class Array_L_RemoveDuplicates
{
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int ptr = i+1;
        while (i < nums.length && ptr < nums.length) {

            if (nums[i] != nums[ptr])
                nums[++i] = nums[ptr];
            else
                ptr++;
        }
        return i+1;
    }

    public static void main (String[] args)
    {
        int[] arr = {0,0,0,1,1,1,2,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1,1,2};
        System.out.println(removeDuplicates(arr2));
        System.out.println(Arrays.toString(arr2));
    }
}
