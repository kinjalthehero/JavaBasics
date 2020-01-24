package practiceProblems.string;

import java.util.*;

public class String_WordCountEngine {

    static String[][] wordCountEngine (String doc) {

        String[] allWords = doc.toLowerCase().split("[^a-zA-Z']+");
        LinkedHashMap<String, Integer> counter = new LinkedHashMap<>();

        Arrays.stream(allWords).forEach(w -> {
            counter.compute(w, (key, value) -> value == null ? 1 : value + 1);
        });
        System.out.println(counter);


        TreeMap<Integer, HashSet<String>> sortedMap = new TreeMap<>(Collections.reverseOrder());

        Arrays.stream(allWords).forEach(w -> {
            int i = counter.get(w);
            if (sortedMap.containsKey(i)) {
                HashSet<String> set = sortedMap.get(i);
                set.add(w);
                sortedMap.put(i, set);
            } else {
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(w);
                sortedMap.put(i, hashSet);
            }

        });

        System.out.println(sortedMap);
        String[][] result=new String[counter.size()][2];
        int iterator=0;
        for(Map.Entry<Integer,HashSet<String>> entry:sortedMap.entrySet()){
            int count=entry.getKey();

            for(Map.Entry<String,Integer> e:counter.entrySet()){
                if(e.getValue()==count){
                    String[] res=new String[2];
                    res[0]=e.getKey();
                    res[1]=String.valueOf(count);
                    result[iterator]=res;
                    iterator++;
                }

            }
        }

        return result;
    }

    static String[][] wordCountEngine2(String document) {

        String[] words = document.split(" ");
        Map<String, String> map = new LinkedHashMap<>();

        for (String w: words) {
            String word = w.toLowerCase();

            if (map.containsKey(word))
                map.put(word, map.get(word));
            else
                map.put(word, Integer.toString(1));
        }

        List<List<String>> temp = new ArrayList<>();

        Set<String> str = map.keySet();

        for (String s: str) {

            String freq = map.get(s);
            List<String> t = new ArrayList<>();
            t.add(s);
            t.add(freq);
            temp.add(t);
        }

        String[][] finalAnswer = new String[temp.size()][2];
        for (int i=0; i < temp.size(); i++) {
            finalAnswer[i][0] = temp.get(i).get(0);
            finalAnswer[i][1] = temp.get(i).get(1);
        }

        return finalAnswer;

        //sort(temp, Comparator.comparingInt(one -> one[1]));

    }



    public static void main(String[] args) {

        String_WordCountEngine wce = new String_WordCountEngine();
        String sentence = "Practice makes perfect. you'll only get Perfect by practice. just practice! practice";
        System.out.println(Arrays.deepToString(wce.wordCountEngine(sentence)));

    }

}