package practiceProblems.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class String_LongestSubstring {

    public static int lengthOfLongestSubstring(String s)
    {
        int n = s.length();
        Set<Character> set = new HashSet<>();

        int ans = 0, i = 0, j = 0;

        while (i < n && j < n)
        {
            if (!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                j++;
                ans = Math.max(ans, j - i);
            }
            else
            {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return ans;
    }

    public static int lengthOfLongestSubstring_optimized(String s)
    {
        int answer = 0;

        // char and index
        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0, i = 0; j < s.length(); j++)
        {
            if (map.containsKey(s.charAt(j)))
                i = Math.max(map.get(s.charAt(j)), i);

            answer = Math.max(answer, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("pwwkew"));
        //System.out.println(lengthOfLongestSubstring_optimized("pwwkew"));
    }
}
