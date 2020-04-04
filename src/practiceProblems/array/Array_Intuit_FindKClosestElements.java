package practiceProblems.array;

import java.util.*;

public class Array_Intuit_FindKClosestElements {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> list = new ArrayList<>();
        for (int i: arr) {
            list.add(i);
        }

        Collections.sort(list, (a,b) -> a == b ? a - b : Math.abs(a-x) - Math.abs(b-x));
        list = list.subList(0,k);
        Collections.sort(list);
        return list;
    }

    public List<Integer> findClosestElements_leet(List<Integer> arr, int k, int x) {

        Collections.sort(arr);
        int lo = 0, hi = arr.size() - k;

        while (lo < hi) {

            int mid = (lo + hi) / 2;

            if (x - arr.get(mid) > arr.get(mid+k) - x)
                lo = mid + 1;
            else
                hi = mid;
        }

        return arr.subList(lo, lo + k);
    }

    public List<Integer> findClosestElements_binary(List<Integer> arr, int noOfElements, int target) {

        int n = arr.size();

        if (target <= arr.get(0))
            return arr.subList(0, noOfElements);
        else if (arr.get(n - 1) <= target)
            return arr.subList(n - noOfElements, n);
        else {
            int index = Collections.binarySearch(arr, target);
            if (index < 0)
                index = -index - 1;
            int low = Math.max(0, index - noOfElements - 1), high = Math.min(arr.size() - 1, index + noOfElements - 1);

            while (high - low > noOfElements - 1) {
                if (low < 0 || (target - arr.get(low)) <= (arr.get(high) - target))
                    high--;
                else if (high > arr.size() - 1 || (target - arr.get(low)) > (arr.get(high) - target))
                    low++;
                else
                    System.out.println("unhandled case: " + low + " " + high);
            }
            return arr.subList(low, high + 1);
        }
    }

    public static void main(String[] args) {

        //int arr[] = {1, 15, 20, 5, 2, 50, 10, 12, 12, 11};
        List<Integer> arr = Arrays.asList(1, 15, 20, 5, 2, 50, 10, 12, 12, 11);
        Array_Intuit_FindKClosestElements s = new Array_Intuit_FindKClosestElements();
        List<Integer> sol = s.findClosestElements_leet(arr, 5, 13);
        System.out.println(sol);
    }
}
