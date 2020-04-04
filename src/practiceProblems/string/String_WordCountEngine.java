package practiceProblems.string;

import java.util.*;

public class String_WordCountEngine {

    String[][] wordCountEngine (String str) {

        String[] words = str.split("[^a-zA-Z']+");
        Map<String, Integer> map = new LinkedHashMap<>();

        System.out.println(Arrays.toString(words));

        for (String w: words) {
            String word = w.toLowerCase();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);

        Set<String> set = map.keySet();
        List<String> list = new ArrayList<>(set);

        Collections.sort(list, (a,b) -> map.get(a) == map.get(b) ? list.indexOf(a) - list.indexOf(b) : map.get(b)-map.get(a));

        System.out.println(list);

        String[][] output = new String[list.size()][2];

        for (int i=0; i < list.size(); i++) {
            output[i][0] = list.get(i);
            output[i][1] = String.valueOf(map.get(list.get(i)));
        }

        return output;
    }

    public static void main(String[] args) {

        String_WordCountEngine wce = new String_WordCountEngine();
        String sentence = "Practice makes perfect. you'll only get Perfect by practice. just practice! practice";
        System.out.println(Arrays.deepToString(wce.wordCountEngine(sentence)));

        int[] nums = {1,1,1,2,2,3};
        System.out.println(topKFrequent_Integer(nums, 2));

        int[] nums2 = {1};
        System.out.println(topKFrequent_Integer(nums2, 1));

    }

    public static List<Integer> topKFrequent_Integer(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int n: nums) {
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        Set<Integer> set = map.keySet();
        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list, (a,b) -> (map.get(a) > map.get(b)) ? -1: 1);

        return list.subList(0,k);
    }

}