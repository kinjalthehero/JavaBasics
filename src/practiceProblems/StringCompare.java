package practiceProblems;

/*
    Define a function to compare values with following conditions :
    if (string1 > string2) it returns a positive value.
    if both the strings are equal lexicographically
    i.e.(string1 == string2) it returns 0.
    if (string1 < string2) it returns a negative value.
    The value is calculated as (int)str1.charAt(i) – (int)str2.charAt(i)
 */

public class StringCompare {

    public int stringCompare (String s1, String s2) {

        int l1 = s1.length();
        int l2 = s2.length();

        for (int i=0; i < l1 && i < l2; i++) {

            int val1 = s1.charAt(i);
            int val2 = s2.charAt(i);

            if (s1.charAt(i) == s2.charAt(i))
                continue;
            else
                return val1-val2;
        }

        // Edge case for strings like
        // String 1="Geeks" and String 2="Geeksforgeeks"
        if (l1 < l2)
            return l1-l2;
        else if (l1 > l2)
            return l1-l2;
        // If none of the above conditions is true
        // it implies both the strings are equal
        else
            return 0;
    }

    public static void main(String[] args) {
        StringCompare sc = new StringCompare();
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "dbc";
        String s4 = "abf";
        String s5 = "a";
        String s6 = "abcdefg";

        System.out.println("Comparing s1 and s2: " + sc.stringCompare(s1, s2));
        System.out.println("Comparing s1 and s2: " + sc.stringCompare(s1, s3));
        System.out.println("Comparing s1 and s2: " + sc.stringCompare(s1, s4));
        System.out.println("Comparing s1 and s2: " + sc.stringCompare(s1, s5));
        System.out.println("Comparing s1 and s2: " + sc.stringCompare(s1, s6));
    }
}
