package practiceProblems.array;

import java.util.Arrays;

public class Array_FirstAndLastPosition {

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);

        return result;
    }

    private int findFirst(int[] nums, int target){

        int idx = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            int mid = (start + end) / 2;

            if (nums[mid] >= target)
                end = mid - 1;
            else
                start = mid + 1;

            if (nums[mid] == target) idx = mid;
        }
        return idx;
    }

    private int findLast(int[] nums, int target){
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            int mid = (start + end) / 2;
            if(nums[mid] <= target)
                start = mid + 1;
            else
                end = mid - 1;

            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,5,5,5,9};
        Array_FirstAndLastPosition obj = new Array_FirstAndLastPosition();
        System.out.println(Arrays.toString(obj.searchRange(arr, 5)));

    }
}
