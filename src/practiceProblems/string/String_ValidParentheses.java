package practiceProblems.string;

import java.util.HashMap;
import java.util.Stack;

class String_ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(char c: s.toCharArray())
        {
            if(c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {
                if(stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String_ValidParentheses obj = new String_ValidParentheses();
        System.out.println(obj.isValid("()"));
        System.out.println(obj.isValid("()[]{}"));
        System.out.println(obj.isValid("({"));
        System.out.println(obj.isValid(("[)]")));
        System.out.println(obj.isValid("{[]}"));


    }
}