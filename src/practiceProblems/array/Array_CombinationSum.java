package practiceProblems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_CombinationSum {

    public List<List<Integer>> combinationSum(int[] nums, int target)
    {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        Arrays.sort(nums);
        backtrack(nums, output, temp, target, 0);
        return output;
    }

    private void backtrack(int [] nums, List<List<Integer>> list, List<Integer> tempList, int remain, int start)
    {
        if(remain < 0)
            return;
        else if(remain == 0)
            list.add(new ArrayList<>(tempList));
        else
            {
                for(int i = start; i < nums.length; i++)
                {
                    tempList.add(nums[i]);
                    backtrack(nums, list, tempList, remain - nums[i], i); // not i + 1 because we can reuse same elements
                    tempList.remove(tempList.size() - 1);
                }
            }
    }
}
