package practiceProblems.linkedList;

public class DLL_DoublyLinkedList {

    static Node dummyNode = new Node(0);
    static Node head = dummyNode.next;
    static Node tail = dummyNode.next;

    static class Node {

        int data;
        Node prev = null;
        Node next = null;

        Node (int data) {
            this.data = data;
        }
    }

    static boolean isEmpty() {

        return (dummyNode.next == null);

    }

    static void insertFirst (Node node) {

        if (isEmpty()) {
            dummyNode.next = node;
            node.next = null;
            node.prev = dummyNode;
            head = node;
            tail = node;
        } else {
            dummyNode.next = node;
            node.next = head;
            node.prev = dummyNode;
            head = node;
        }
    }

    static void insertLast (Node node) {

        if (isEmpty()) {
            dummyNode.next = node;
            node.next = null;
            node.prev = dummyNode;
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    static void deleteFirst() {

        if (isEmpty())
            System.out.println("Empty Linked List");

        dummyNode.next = dummyNode.next.next;
        head = head.next;
        head.prev = dummyNode;
    }

    static void deleteLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    static void printForward () {

        Node curr = dummyNode.next;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    static void printBackwards() {

        if (isEmpty())
            return;

        Node curr = tail;
        System.out.print("Printing backwards: ");

        while (curr != dummyNode) {

            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
    }

    static void deleteAfter(Node node) {

        if(isEmpty())
            return;

        Node curr = head;

        while (curr != null && curr != node) {
            curr = curr.next;
        }

        if (curr.next == null)
            return;

        curr.next.prev = curr.prev;
        curr.prev.next = curr.next;
    }

    public static void main(String[] args) {

        Node head = new Node (1);
        Node node2 = new Node (2);
        Node node3 = new Node (3);
        Node node4 = new Node (4);
        Node node5 = new Node (5);

        insertFirst(head);
        insertLast(node2);
        insertLast(node3);
        insertLast(node4);
        insertLast(node5);
        printForward();
        System.out.println();
        printBackwards();

        System.out.println();
        deleteFirst();
        printForward();
        System.out.println();
        printBackwards();

        System.out.println();
        deleteLast();
        printForward();
        System.out.println();
        printBackwards();
        System.out.println();

        insertFirst(head);
        insertLast(node5);
        printForward();
        System.out.println();

        System.out.println("Delete after");
        deleteAfter(head);
        printForward();
        System.out.println();
        deleteAfter(node3);
        printForward();
        System.out.println();
        deleteAfter(node5);
        printForward();
        System.out.println();
    }
}
