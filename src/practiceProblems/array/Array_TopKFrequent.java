package practiceProblems.array;

import java.util.*;

public class Array_TopKFrequent {

    public static String[] kMostFrequent (String[] input, int k) {

        Map<String, Integer> map = new HashMap<>();

        for (String s: input) {
            map.put(s, map.getOrDefault(s,0) + 1);
        }

        Set<String> keys = map.keySet();
        List<String> list = new ArrayList<>(keys);

        list.sort((a,b) -> a.compareTo(b));
        list.sort((a, b) -> (map.get(a) < map.get(b)) ? -1 : 1);
        list.sort(Comparator.reverseOrder());

        list.sort((a, b) -> map.get(a) == map.get(b) ? a.compareTo(b) : map.get(a) < map.get(b) ? 1 : -1);

        String[] output = new String[k];

        for (int i = 0; i < k; i++) {
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
