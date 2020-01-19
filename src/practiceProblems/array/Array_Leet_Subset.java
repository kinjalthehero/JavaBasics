package practiceProblems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Leet_Subset {

    public static List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(nums, output, temp, 0);

        return output;
    }

    private static void backtrack(int [] input, List<List<Integer>> output , List<Integer> temp, int start)
    {
        output.add(new ArrayList<>(temp));

        for(int i = start; i < input.length; i++)
        {
            temp.add(input[i]);

            backtrack(input, output, temp, i + 1);

            temp.remove(temp.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums)
    {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        // sort is important because we will check for duplicates later
        // They should be in sequence
        Arrays.sort(nums);

        backtrack_subsetsWithDup(nums, list, output, 0);
        return list;
    }

    private static void backtrack_subsetsWithDup(int [] input, List<List<Integer>> output, List<Integer> temp, int start)
    {
        output.add(new ArrayList<>(temp));

        for(int i = start; i < input.length; i++)
        {
            // skip duplicates
            if(i > start && input[i] == input[i-1])
                continue;

            temp.add(input[i]);

            backtrack_subsetsWithDup(input, output, temp, i + 1);

            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {

        /*int[] arr = {1,2,3};
        System.out.println(Arrays.toString(subsets(arr).toArray()));*/

        int[] arrWithDuplicate = {1,2,2};
        System.out.println(Arrays.toString(subsetsWithDup(arrWithDuplicate).toArray()));

    }
}
