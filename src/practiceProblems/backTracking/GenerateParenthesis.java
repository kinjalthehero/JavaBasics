package practiceProblems.backTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static List<String> generateParenthesis (int n) {

        List<String> output = new ArrayList<>();
        backtrack(output, 0, 0, n, "");
        return output;
    }


    static void backtrack (List<String> output, int open, int close, int length, String str) {

        if (str.length() == length*2) {
            output.add(str);
            return;
        }

        if (open < length)
            backtrack(output, open+1, close, length, str+"(");

        if (close < open)
            backtrack(output, open, close+1, length, str+")");

    }

    public static void main(String[] args) {

        System.out.println(generateParenthesis(4));
    }

}
