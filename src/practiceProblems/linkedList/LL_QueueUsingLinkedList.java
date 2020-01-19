package practiceProblems.linkedList;

public class LL_QueueUsingLinkedList {

    static Node front, back;
    static Node dummyNode = new Node(0);
    static int size;

    static class Node {

        int data;
        Node next;

        Node (int data) {
            this.data = data;
        }
    }

    static boolean isFull() {

        return (size == 5);
    }

    static boolean isEmpty() {

        return (size == 0);
    }


    static void add (Node node) {

        if (isFull()) {
            System.out.println("Can't add " + node.data + ". Queue is full");
        } else if(isEmpty()) {
            dummyNode.next = node;
            front = node;
            back = node;
            size++;
            System.out.println("Element added " + node.data);
        } else {
            back.next = node;
            back = node;
            size++;
            System.out.println("Element added " + node.data);
        }
    }

    static void remove () {

        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Removed element: " + front.data);
            dummyNode.next = front.next;

            if (front == back)
                back = back.next;

            front = front.next;
            size--;

        }
    }

    static void print() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node curr = front;

        while(curr != null) {
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

        add(head);
        add(node2);
        add(node3);
        add(node4);
        add(node5);
        add(node6);

        print();
        System.out.println();

        remove();
        System.out.println();
        print();

        remove();
        System.out.println();
        print();

        remove();
        System.out.println();
        print();

        remove();
        System.out.println();
        print();

        remove();
        System.out.println();
        print();

        remove();
        System.out.println();
        print();
    }

}