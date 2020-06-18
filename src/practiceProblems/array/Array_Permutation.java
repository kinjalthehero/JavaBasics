package practiceProblems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Permutation {

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(nums, output, temp);

        return output;
    }

    private static void backtrack(int [] input, List<List<Integer>> output, List<Integer> temp) {

        if(temp.size() == input.length) {
            output.add(temp);
            System.out.println(output);
        }
        else {
            for(int i = 0; i < input.length; i++) {

                if(temp.contains(input[i]))
                    continue;

                temp.add(input[i]);
                backtrack(input, output, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static List<List<Integer>> permute_withDuplicates(int[] nums) {

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        Arrays.sort(nums);
        backtrack_withDuplicates(nums, output, temp, used);

        return output;
    }

    private static void backtrack_withDuplicates(int[] input, List<List<Integer>> output, List<Integer> temp, boolean[] used)
    {
        if(temp.size() == input.length)
        {
            output.add(new ArrayList<>(temp));
        }
        else
        {
            for(int i = 0; i < input.length; i++)
            {
                if(used[i] || i > 0 && input[i] == input[i-1] && !used[i - 1])
                    continue;

                used[i] = true;
                temp.add(input[i]);

                backtrack_withDuplicates(input, output, temp, used);

                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        //System.out.println(Arrays.toString(permute(arr).toArray()));
        System.out.println(permute(arr));

        int[] arrWithDuplicate = {1,1,2};
        //System.out.println(Arrays.toString(permute_withDuplicates(arrWithDuplicate).toArray()));
    }
}
