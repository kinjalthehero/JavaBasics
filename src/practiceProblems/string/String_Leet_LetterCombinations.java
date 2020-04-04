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

        String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        letterCombinationsRecursive(result, digits, "", 0, mapping);
        return result;
    }

    public static void letterCombinationsRecursive(List<String> output, String input, String currString, int currIndex, String[] mapping)  {

        // NOTICE: NOT input.length()-1
        if (currString.length() == input.length()) {
            output.add(currString);
            return;
        }

        // convert char to int
        String letters = mapping[input.charAt(currIndex) - '0'];

        for (int i=0; i < letters.length(); i++) {
            letterCombinationsRecursive(output, input, currString + letters.charAt(i), currIndex+1, mapping);
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(allCombinations("23").toArray()));
        System.out.println(Arrays.toString(allCombinations("234").toArray()));
    }

    static List<String> allCombinations (String digits) {

        List<String> output = new ArrayList<>();

        if (digits == null || digits.length() == 0)
            return output;

        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        getCombinations (digits, output, mapping, "", 0);
        return output;
    }

    static void getCombinations (String digits, List<String> output, String[] mapping, String currCombination, int currIndex) {

        if (currCombination.length() == digits.length()) {
            output.add(currCombination);
            return;
        }

        for (int i=0; i < digits.length(); i++) {
            getCombinations(digits, output, mapping, currCombination + digits.charAt(i), currIndex + 1);
        }
    }
}


