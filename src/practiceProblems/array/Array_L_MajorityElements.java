package practiceProblems.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Array_L_MajorityElements {

    // Time complexity : O(nlgn)O(nlgn)
    public static int majorityElement_Sorting(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static int majorityElement_HashMap(int[] nums) {

        int halfLength = nums.length/2;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num)+1);
            else
                map.put(num,1);
        }

        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            int val = itr.next();

            if (map.get(val) > halfLength)
                return val;
        }
        return -1;
    }

    public static void main (String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement_HashMap(arr));
    }
}
