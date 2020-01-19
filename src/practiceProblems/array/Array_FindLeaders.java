package practiceProblems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_FindLeaders {

    // Brute force approach
    public static void findLeadersInAnArrayBruteForce(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            boolean isLeader = true;

            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i] <= arr[j])
                {
                    isLeader = false;
                    break;
                }
            }

            if(isLeader)
                System.out.print(arr[i]+" ");
        }
    }

    // Another approach
    public static void findLeadersInAnArray(int arr[])
    {
        // Rightmost will always be a leader
        int rightMax = arr[arr.length-1];
        System.out.print(rightMax+" ");

        // Start from the right and check one element at a time
        // If the element is greater than max than replace the max and print the element
        for (int i = arr.length-2; i>=0; i--) {
            if(arr[i] > rightMax)
            {
                rightMax = arr[i];
                System.out.print(" "+rightMax);
            }
        }
    }

    static List<Integer> leaders (int[] arr) {

        List<Integer> list = new ArrayList<>();
        int leader = arr[arr.length-1];
        list.add(leader);

        for (int i = arr.length-2; i >= 0; i--) {

            if (arr[i] > leader) {

                leader = arr[i];
                list.add(leader);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        findLeadersInAnArrayBruteForce(arr);
        System.out.println("n==================");
        findLeadersInAnArray(arr);
        System.out.println("Kinjal" + Arrays.toString(leaders(arr).toArray()));
    }
}
