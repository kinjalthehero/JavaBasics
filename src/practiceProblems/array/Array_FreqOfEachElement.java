package practiceProblems.array;

import java.util.HashMap;

public class Array_FreqOfEachElement {

    // Using Hashmap
    public static HashMap<Integer, Integer> solveIterative(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : arr)
        {
            if(!map.containsKey(val))
            {
                map.put(val, 1);
            }
            else
            {   map.put(val, map.get(val)+1);
            }
        }
        return map;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 2, 3, 3, 4, 5, 5, 6, 6};

        System.out.print("arr[]: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }

        System.out.println(" }");
        HashMap<Integer, Integer> freqMap = solveIterative(arr);

        for(int val : freqMap.keySet())
        {
            System.out.println("Frequency of " + val + " is : " + freqMap.get(val));
        }

    }
}
