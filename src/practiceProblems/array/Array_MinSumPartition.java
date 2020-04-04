package practiceProblems.array;

import java.util.HashMap;
import java.util.Map;

public class Array_MinSumPartition {

    public static int minSumPartition (int[] arr) {

        Map<String, Integer> map = new HashMap<>();
        return minPartition(arr, 0, 0, 0, map);
    }

    // time complexity: O(n * sum) where n is no. of element and sum is sum of all elements in the array
    // space complexity: O(n * sum) where n is no. of element and sum is sum of all elements in the array
    public static int minPartition(int[] arr, int currIndex, int set1Sum, int set2Sum, Map<String, Integer> map) {

        if (currIndex == arr.length)
            return Math.abs(set1Sum - set2Sum);

        // uniquely identify the subproblem with currIndex & set1Sum only
        String key = currIndex + "|" + set1Sum;

        if (!map.containsKey(key)) {
            int inc = minPartition(arr, currIndex + 1, set1Sum + arr[currIndex], set2Sum, map);
            int exc = minPartition(arr, currIndex + 1, set1Sum, set2Sum + arr[currIndex], map);
            map.put(key, Math.min(inc, exc));
        }

        return map.get(key);
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 15, 5, 25 };
        System.out.println("The minimum difference is " + minSumPartition(arr));

        int[] arr2 = {3, 1, 4, 2, 2, 1};
        System.out.println("The minimum difference is " + minSumPartition(arr2));
    }

}
