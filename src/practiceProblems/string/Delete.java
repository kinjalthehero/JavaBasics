package practiceProblems.string;

import java.util.*;

public class Delete {

    public static boolean validParenthesis (String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            char parenthesis = input.charAt(i);

            if (parenthesis == '(')
                stack.push(')');
            else if (parenthesis == '{')
                stack.push('}');
            else if (parenthesis == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.peek() != parenthesis)
                    return false;
                else
                    stack.pop();
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(validParenthesis("()[]{}"));
    }
}
