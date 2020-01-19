package practiceProblems.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Array_Leet_SingleNumber
{




    static int findSingleNumber (int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums)
        {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }

        Iterator<Integer> itr = map.keySet().iterator();

        while (itr.hasNext()) {
            int key = itr.next();
            if (map.get(key) == 1)
                return key;
        }

        return -1;
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i))
                set.remove(i);
            else
                set.add(i);
        }

        for (int i : set)
            return i;

        return -1;
    }

    public static void main(String[] args) {
        int[] num = {1,1,2,2,3};
        System.out.print(findSingleNumber(num));

        int[] num2 = {1,1,2,2,3,3};
        System.out.print(findSingleNumber(num2));

        int[] num3 = {1};
        System.out.print(findSingleNumber(num3));

        int[] num4 = {1,1,2,2,3};
        System.out.print(singleNumber(num4));

        int[] num5 = {1,1,2,2,3,3};
        System.out.print(singleNumber(num5));

        int[] num6 = {1};
        System.out.print(singleNumber(num6));

    }


}
