package practiceProblems.array;

import java.util.Arrays;

public class Array_L_MoveZeros {

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int insertPos = 0;
        for (int num: nums)
        {
            if (num != 0)
            {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        while (insertPos < nums.length)
        {
            nums[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main (String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
