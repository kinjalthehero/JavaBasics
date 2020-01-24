package practiceProblems.array;

import java.util.*;

public class Array_TopKFrequent {

    public static List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> map = new HashMap();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> candidates = new ArrayList(map.keySet());

        Collections.sort(candidates, (w1, w2) -> map.get(w1).equals(map.get(w2)) ?
                w1.compareTo(w2) : map.get(w2) - map.get(w1));

        return candidates.subList(0, k);
    }

    public static void main(String[] args) {

        String[] str = {"i", "love", "leetcode", "i", "love", "coding"};
        topKFrequent(str, 2);

        String[] str2 = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        topKFrequent(str, 4);

    }

    int[] kMostFrequent (String[] arr, int k) {

        Map<String, Integer> map = new HashMap<>();

        for (String a: arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        List<String> words = new ArrayList<>(map.keySet());

        Collections.sort(words, (a, b) -> map.get(a).equals(map.get(b)) ?  a.compareTo(b) : map.get(b) - map.get(a));

        List<String> answer = words.subList(0, k);

        int[] ans = answer.stream()
        mapToInt(j -> j).toArray();

        return ans;



    }

}
