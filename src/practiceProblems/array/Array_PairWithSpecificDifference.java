package practiceProblems.array;

import java.util.*;

class Array_PairWithSpecificDifference {

    static int[][] findPairsWithGivenDifference2(int[] arr, int k) {

        Set<Integer> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i : arr) {
            set.add(i);
        }

        for (int i : arr) {

            int x = k + i;

            if (set.contains(x)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(i);
                ans.add(temp);
            }
        }

        int[][] finalAnswer = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            finalAnswer[i][0] = ans.get(i).get(0);
            finalAnswer[i][1] = ans.get(i).get(1);
        }

        return finalAnswer;

    }

    // x - y = k
    // x = k + y
    static int[][] findPairsWithGivenDifference(int[] arr, int k) {

        Set<Integer> set = new HashSet<>();
        List<List<Integer>> answer = new ArrayList<>();

        for (int y : arr) {

            int x = k + y;

            if (set.contains(x)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(y);
                answer.add(temp);
                set.add(y);
            } else {
                set.add(y);
            }
        }

        int[][] finalAnswer = new int[answer.size()][2];

        for (int i = 0; i < answer.size(); i++) {
            finalAnswer[i][0] = answer.get(i).get(0);
            finalAnswer[i][0] = answer.get(i).get(1);
        }

        return finalAnswer;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, -2, 2, 1};
        int[][] solution = findPairsWithGivenDifference(arr, 1);
        System.out.println(Arrays.deepToString(solution));

        int[] arr2 = {1, 7, 5, 3, 32, 17, 12};
        //int[][] solution2 = findPairsWithGivenDifference(arr2, 17);
        //System.out.println(Arrays.deepToString(solution2));
    }

}