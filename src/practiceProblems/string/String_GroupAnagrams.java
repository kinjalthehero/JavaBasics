package practiceProblems.string;

import java.util.*;

public class String_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs)
        {
            char[] chars = str.toCharArray();  // String to char array
            Arrays.sort(chars);
            String sortedChars = String.valueOf(chars); // Char array to String

            if (!map.containsKey(sortedChars))
                map.put(sortedChars, new ArrayList<>());

            map.get(sortedChars).add(str);
        }

        // map.values() return collection of values
        return new ArrayList<>(map.values());
    }

}
