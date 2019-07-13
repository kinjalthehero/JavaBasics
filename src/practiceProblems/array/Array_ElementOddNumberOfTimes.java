package practiceProblems.array;

import java.util.HashMap;
import java.util.Map;

public class Array_ElementOddNumberOfTimes {

    public static void main (String[] args)
    {
        int[] arr = {1,2,3,2,4,5,2,5,4,4};
        elementOccurringOddNumberOfTimes(arr);
    }

    // Space complexity O(n) <= This is bad
    // Time complexity O(n)
    public static  int elementOccurringOddNumberOfTimes(int ar[])
    {
        HashMap<Integer,Integer> elements=new HashMap<Integer,Integer>();

        for (int i = 0; i < ar.length; i++)
        {
            int element=ar[i];
            if(elements.get(element)==null)
            {
                elements.put(element, 1);
            }
            else
            {
                elements.put(element, elements.get(element) + 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry:elements.entrySet()) {
            if(entry.getValue() %2 == 1)
            {
                return entry.getKey();
            }

        }
        return -1;
    }


}

