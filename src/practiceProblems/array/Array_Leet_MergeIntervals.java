package practiceProblems.array;

import java.util.*;

import static java.util.Arrays.*;

class Array_Leet_MergeIntervals
{
    public static int[][] merge(int[][] intervals)
    {
        LinkedList<int[]> result = new LinkedList<>();

        sort(intervals, Comparator.comparingInt(one -> one[0]));

        for(int[] interval: intervals){
            if(result.size() == 0 || result.getLast()[1] < interval[0])
                result.add(interval);
            else{
                result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }



    public static void main(String[] args) {

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

        for (int[] res: result) {
            System.out.println(Arrays.toString(res));
        }

    }
}