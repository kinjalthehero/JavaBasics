package practiceProblems.string;

import java.util.HashSet;
import java.util.Set;

public class String_BuildLongPalindrome {

    public static int longestPalindrome (String str) {

        int count = 0;

        if (str.length() == 0 || str == null)
            return 0;

        Set<Character> set = new HashSet<>();

        for (int i=0; i < str.length(); i++) {

            if (set.contains(str.charAt(i))) {
                set.remove(str.charAt(i));
                count++;
            } else
                set.add(str.charAt(i));
        }

        if (!set.isEmpty())
            return (count * 2) + 1;
        else
            return count*2;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("abccccdd"));
    }
}
