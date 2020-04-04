package practiceProblems.array;

import java.util.*;

public class Array_TopKFrequent {

    public static String[] kMostFrequent2 (String[] arr, int k) {

        Map<String, Integer> map = new HashMap<>();

        for (String a: arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        // Getting set and putting it in a list.
        // Because we can't apply compareTo
        //Set<String> set = map.keySet();
        List<String> words = new ArrayList<>(map.keySet());
        Collections.sort(words, (a, b) -> map.get(a) == map.get(b) ?  a.compareTo(b) : map.get(b) - map.get(a));

        List<String> answer = words.subList(0, k);

        // Convert String ArrayList to primitive array
        String[] str = new String[answer.size()];
        for (int j = 0; j < answer.size(); j++) {
            str[j] = answer.get(j);
        }

        return str;
    }

    public static String[] kMostFrequent (String[] input, int k) {

        Map<String, Integer> map = new HashMap<>();

        for (String s: input) {
            map.put(s, map.getOrDefault(s,0) + 1);
        }

        Set<String> set = map.keySet();
        List<String> list = new ArrayList<>(set);

        Collections.sort(list, (a,b) -> map.get(a) == map.get(b) ? a.compareTo(b) : map.get(b) - map.get(a));

        list.subList(0,k);

        String[] output = new String[list.size()];

        for (int i=0; i < list.size(); i++) {
            output[i] = list.get(i);
        }

        return output;
    }

    public static void main(String[] args) {

        String[] str = {"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(Arrays.toString(kMostFrequent(str, 2)));

        String[] str2 = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        System.out.println(Arrays.toString(kMostFrequent(str2, 4)));

    }



}
