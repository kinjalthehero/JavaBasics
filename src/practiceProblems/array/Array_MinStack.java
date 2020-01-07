package practiceProblems.array;

import java.util.Stack;

public class Array_MinStack {

    int min;
    Stack<Integer> stack;

    public Array_MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack<Integer>();
    }

    // If x is less than min value then push the old minimum value first and update min variable. Push x after that.
    public void push(int x)
    {
        if(x <= min)
        {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    // If popped element is min value, pop twice and change the current min value to the last min value
    public void pop() {

        if(stack.pop() == min)
            min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        Array_MinStack minStack = new Array_MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());   // Returns -3.
        minStack.pop();
        System.out.println(minStack.top());      // Returns 0.
        System.out.println(minStack.getMin());   // Returns -2.

    }
}
