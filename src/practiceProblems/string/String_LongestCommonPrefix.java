package practiceProblems.string;


// Leet - https://leetcode.com/problems/longest-common-prefix/solution/
public class String_LongestCommonPrefix {

    public static String longestCommonPrefix_HorizontalScanning(String[] strs) {

        if (strs.length == 0)
            return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++)
        {
            while (strs[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }

    public static String longestCommonPrefix_verticalScanning(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        for (int i = 0; i < strs[0].length() ; i++)
        {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j ++)
            {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }


    public static void main(String[] args)
    {
        String[] strArr={"java2blog","javaworld","javabean","javatemp"};
        String longestPrefix=longestCommonPrefix_HorizontalScanning(strArr);
        System.out.println("Longest Prefix : "+longestPrefix);

        longestPrefix=longestCommonPrefix_verticalScanning(strArr);
        System.out.println("Longest Prefix : "+longestPrefix);
    }


}
