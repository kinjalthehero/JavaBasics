package practiceProblems.array;

public class Array_Stack {

    int top = -1;
    int[] arr;
    int size;

    Array_Stack (int capacity) {
         arr = new int[capacity];
         this.size = capacity;
    }

    void push(int num) {

        System.out.println("Trying to add " + num);

        if (isFull()) {
            System.out.println("Full");
            return;
        }

        arr[++top] = num;
    }

    void pop () {

        System.out.println("Trying to remove an element from the top");
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        System.out.println("Removed " + arr[top]);
        top--;

    }

    void print() {
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    boolean isEmpty() {

        if (top == -1)
            return true;

        return false;
    }

    boolean isFull() {

        if (top == arr.length-1)
            return true;

        return false;
    }

    public static void main(String[] args) {

        Array_Stack StackCustom = new Array_Stack(5);
        StackCustom.pop();
        System.out.println("=================");
        StackCustom.push(10);
        StackCustom.print();
        StackCustom.push(30);
        StackCustom.print();
        StackCustom.push(50);
        StackCustom.print();
        StackCustom.push(40);
        StackCustom.print();
        StackCustom.push(60);
        StackCustom.print();
        StackCustom.push(70);
        StackCustom.print();
        System.out.println("=================");
        StackCustom.pop();
        StackCustom.print();
        StackCustom.pop();
        StackCustom.print();
        StackCustom.pop();
        StackCustom.print();
        StackCustom.pop();
        StackCustom.print();
        StackCustom.pop();
        StackCustom.print();
        System.out.println("=================");
    }

}

