package practiceProblems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Array_Leet_ThreeSum {

    public static List<List<Integer>> threeSum (int[] num)
    {
        List<List<Integer>> res = new LinkedList<>();

        if (num.length < 3)
            return res;

        Arrays.sort(num);

        for (int firstNumber = 0; firstNumber < num.length-2; firstNumber++)
        {
            if (num[firstNumber] > 0)
                break;

            if (firstNumber == 0 || num[firstNumber] != num[firstNumber-1])
            {
                int low = firstNumber+1, high = num.length-1;

                while (low < high)
                {
                    if (num[low] + num[high] + num[firstNumber] == 0)
                    {
                        res.add(Arrays.asList(num[firstNumber], num[low], num[high]));

                        while (low < high && num[low] == num[low+1])
                            low++;

                        while (low < high && num[high] == num[high-1])
                            high--;

                        low++;
                        high--;
                    }
                    else if (num[low] + num[high] + num[firstNumber] < 0) {
                        while (low < high && num[low] == num[low+1])
                        {
                            low++;
                        }
                        low++;
                    }
                    else {
                        while (low < high && num[high] == num[high-1])
                        {
                            high--;
                        }
                        high--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(Arrays.toString(ans.toArray()));


    }
}

