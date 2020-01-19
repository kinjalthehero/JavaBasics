package practiceProblems.string;

public class String_LongestPalindrome {

    public static String longestPalindrome(String str)
    {
        String max = "";

        for (int i = 0; i < str.length(); i++)
        {
            // To handle odd length
            String s1 = extend (str, i, i);

            // To handle even length
            String s2 = extend (str, i, i + 1);

            if (s1.length() > max.length())
                max = s1;

            if (s2.length() > max.length())
                max = s2;
        }

        return max;
    }

    private static String extend(String s, int start, int end) {

        while (start >= 0 && end < s.length())
        {
            if (s.charAt(start) != s.charAt(end))
                break;

            start--;
            end++;
        }

        return s.substring(start + 1, end);
    }


    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
    }


}
