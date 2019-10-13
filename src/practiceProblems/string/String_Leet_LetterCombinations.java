package practiceProblems.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class String_Leet_LetterCombinations {

    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty())
            return result;

        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        letterCombinationsRecursive(result, digits, "", 0, mapping);
        return result;
    }

    public static void letterCombinationsRecursive(List<String> result, String digits, String currString, int currIndex, String[] mapping)
    {
        if (currString.length() == digits.length())
        {
            result.add(currString);
            return;
        }

        String letters = mapping[digits.charAt(currIndex) - '0'];

        for (int i=0; i < letters.length(); i++)
        {
            letterCombinationsRecursive(result, digits, currString + letters.charAt(i), currIndex+1, mapping);
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(letterCombinations("23").toArray()));
        System.out.println(Arrays.toString(letterCombinations("234").toArray()));
    }

}

