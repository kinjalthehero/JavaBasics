package practiceProblems.array;

import java.util.*;

public class Array_TwoSum {

    public static int[][] twoSumUsingHashSet (int[] arr, int X) {

        if (arr.length < 2)
            return new int[][]{};

        Set<Integer> set = new HashSet<>();
        List<List<Integer>> solution = new ArrayList<>();

        for(int value : arr)
        {
            int target = X - value;

            if (set.contains(target)) {

                List<Integer> temp = new ArrayList<>();
                temp.add(value);
                temp.add(target);
                solution.add(temp);
            }
            else
                set.add(value);
        }

        int[][] answer = new int[solution.size()][2];

        for (int i=0; i < solution.size(); i++) {
            answer[i][0] = solution.get(i).get(0);
            answer[i][1] = solution.get(i).get(1);
        }

        return answer;
    }

    public static void findPairsWithSumEqualsToXBruteForce(int arr[], int X)
    {
        if (arr.length < 2)
            return;

        System.out.println("The pair whose sum is closest to 15 using brute force method: ");

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tempSum = arr[i] + arr[j];

                if (tempSum == X) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    // Time complexity : O(NLogN)
    // Space complexity : O(N)
    public static void findPairsEqualsToX(int arr[], int X)
    {

        if (arr.length < 2)
            return;

        Arrays.sort(arr);

        System.out.println("The pair whose sum is closest to 15 : ");

        // left and right index variables
        int leftindex = 0, rightIndex = arr.length - 1;

        while (leftindex < rightIndex)
        {
            int currentSum = arr[leftindex] + arr[rightIndex];

            if (currentSum == X) {
                System.out.println(arr[leftindex] + " " + arr[rightIndex]);
                leftindex++;
                rightIndex--;
            } else if (arr[leftindex] + arr[rightIndex] < X)
                leftindex++;
            else
                rightIndex--;
        }
    }

    /*
        Using Hashing

        Put array element in HashMap with element as key and its index as value.
        Iterate over array arr[]
        Check for arr[i],  if X-arr[i] is present in HashMap.
        If yes, we have found the pair and print it.
    */
    public static void findPairsEqualsToXUsingHashing(int arr[], int X)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        System.out.println("The pair whose sum is closest to 15 : ");

        for (int i = 0; i < arr.length; i++)
        {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            // we have used map.get(X-arr[i])!=i to avoid using same
            // element twice
            if (map.get(X - arr[i]) != null && map.get(X - arr[i]) != i) //
            {
                System.out.println(arr[i] + " " + (X - arr[i]));
            }
        }
    }



    public static void main(String[] args) {
        int array[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
        findPairsWithSumEqualsToXBruteForce(array, 15);
        findPairsEqualsToX(array, 15);
        findPairsEqualsToXUsingHashing(array, 15);


        System.out.println("Using HashSet");
        System.out.println(Arrays.deepToString(twoSumUsingHashSet(array, 15)));
    }
}