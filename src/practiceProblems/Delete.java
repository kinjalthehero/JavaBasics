package practiceProblems;

import java.util.*;

public class Delete {

    static int firstNonRepeating(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {

            // Need to create inner variable separately because we will use it outside the inner loop
            int j;

            // Now compare ith element with all other element in the array
            for (j = 0; j < arr.length; j++)
            {
                // If elements are same then ith element has duplicate
                if (i != j && arr[i] == arr[j])
                {
                    // Break out of inner loop
                    // Move to the next ith element to check for duplicate
                    break;
                }
            }

            // If it doesn't contain duplicate then j will increment to arr.length (which is +1 compared to arr.length-1 from the for loop length)
            // Return ith element because we couldn't find duplicate element in the entire array
            if (j == arr.length)
                return arr[i];
        }

        return -1;
    }

    static String rotation (String str) {

        String[] words = str.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        StringBuilder sb = new StringBuilder();

        for (String word: words) {

            word = word.substring(0,1).toUpperCase() + word.substring(1);
            sb.append(word);
            sb.append(" ");
        }

        return sb.toString();
    }

    static void printFrequencyOfChars (String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() != 1)
                System.out.println("Bank name: " + entry.getKey() + ", Type of loan: " + entry.getValue());
        }
    }

    static String reverseWords (String str) {

        String[] strArr = str.trim().split("\\s+");
        int left = 0, right = strArr.length-1;

        while (left < right) {
            String temp = strArr[left];
            strArr[left++] = strArr[right];
            strArr[right--] = temp;
        }

        StringBuilder sb = new StringBuilder();

        int index = 0;
        while (index < strArr.length) {
            sb.append(strArr[index++]);
            sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String args[])
    {
        int arr1[] = { 9, 4, 9, 6, 7, 4 };;
        System.out.println(firstNonRepeating(arr1));

        String str = "I love my Boston";
        System.out.println(rotation(str));

        printFrequencyOfChars("Programming");

        Map<String, String> map = new TreeMap<>();
        map.put("tree", "has leaves");
        map.put("abc", "letters");
        map.put("zebra", "animal");
        map.put("cheetah", "animal");
        map.put("ball", "cricket");

        for (Map.Entry<String, String> item: map.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

        System.out.println(reverseWords("i am a citizen of the world"));
    }
}

