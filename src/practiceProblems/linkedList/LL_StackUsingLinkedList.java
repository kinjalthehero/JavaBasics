package practiceProblems.linkedList;

public class LL_StackUsingLinkedList {

    static Node dummyNode = new Node(0);
    static int size = 0;

    static class Node {

        int data;
        Node next;

        Node (int data) {
            this.data = data;
        }
    }

    static void push (Node node) {

        if (isFull()) {
            System.out.println("Stack is full.");
            return;
        }

        if(isEmpty()) {
            dummyNode.next = node;
            size++;
        } else {
            node.next = dummyNode.next;
            dummyNode.next = node;
            size++;
        }
    }

    static void pop () {

        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Removed " + dummyNode.next.data);
            dummyNode.next = dummyNode.next.next;
            size--;
        }

    }

    static boolean isEmpty() {
        return (size == 0);

    }

    static boolean isFull() {
        return (size == 5);

    }

    static void print () {

        Node curr = dummyNode.next;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node node2 = new Node (2);
        Node node3 = new Node (3);
        Node node4 = new Node (4);
        Node node5 = new Node (5);
        Node node6 = new Node (6);
        push(head);
        push(node2);
        push(node3);
        push(node4);
        push(node5);
        push(node6);
        print();
        System.out.println();

        pop();
        print();
        pop();
        print();
        pop();
        print();
        pop();
        print();
        pop();
        print();
        pop();
        print();

    }

}