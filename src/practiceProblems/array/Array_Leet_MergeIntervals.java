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

    public static int[][] mergeInterval (int[][] intervals) {

        if (intervals.length <= 1)
            return intervals;

        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            else {                             // Disjoint intervals, add the new interval to the list
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }



    public static void main(String[] args) {

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = mergeInterval(intervals);

        for (int[] res: result) {
            System.out.println(Arrays.toString(res));
        }

    }
}