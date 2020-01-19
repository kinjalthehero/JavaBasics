package practiceProblems.string;

import java.util.Stack;

public class String_RemoveAdjacentDuplicates {

    public String removeDuplicates(String str)
    {
        StringBuilder sb = new StringBuilder();
        int sbLength = 0;

        for(char c : str.toCharArray())
        {
            if (sbLength != 0 && c == sb.charAt(sbLength - 1))
                sb.deleteCharAt(sbLength-- - 1);
            else
            {
                sb.append(c);
                sbLength++;
            }
        }

        return sb.toString();
    }

    public String removeDuplicates_stack(String str)
    {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray())
        {
            if (!stack.isEmpty() && c == stack.peek())
                stack.pop();
            else
                stack.push(c);
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String_RemoveAdjacentDuplicates obj = new String_RemoveAdjacentDuplicates();
        System.out.println(obj.removeDuplicates_stack("abbaca"));
    }
}
