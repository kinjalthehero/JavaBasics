package practiceProblems.array;

import java.util.*;

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
        int[] arr = {2,2,1,1,1,2,2,2,2,2};
        System.out.println(majority(arr));
    }

    static int majority (int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int a : arr) {

            if (map.containsKey(a))
                map.put(a, map.get(a) + 1);
            else
                map.put(a, 1);
        }

        Set<Integer> set = map.keySet();

        for (Integer a : set) {

            int val = map.get(a);
            int half = (arr.length / 2);

            if (val > half)
                return a;
        }

        return 0;
    }
}
