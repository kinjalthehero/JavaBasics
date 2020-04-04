package practiceProblems.linkedList;

public class LL_Leet_DeleteNthFromEnd {

    private static class Node {

        int val;
        Node next;

        Node (int val) {

            this.val = val;
        }
    }

    void print (Node head) {

        Node temp = head;

		while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    void insertLast (Node head, Node node) {

        Node temp = head;

        if (temp == null) {
            head = node;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }

    void length (Node head) {

        Node temp = head;
        int length = 0;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        System.out.println("Length: " + length);

    }

    public static Node removeNthFromEnd(Node head, int n) {

        Node dummyNode = new Node(0);
        dummyNode.next = head;

        Node slow = dummyNode;
        Node fast = dummyNode;

        // if n=3, move 3 times
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (fast != null) {
            slow.next = slow.next.next;
        }

        return dummyNode.next;

    }

    public static void main (String[] args) {

        LL_Leet_DeleteNthFromEnd ln = new LL_Leet_DeleteNthFromEnd();

        Node node1 = new Node(1);
        /*Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        ln.insertLast(null, node1);
        ln.insertLast(node1, node2);
        ln.insertLast(node1, node3);
        ln.insertLast(node1, node4);
        ln.insertLast(node1, node5);
        ln.insertLast(node1, node6);
        ln.insertLast(node1, node7);
        ln.print(node1);
        System.out.println();
        nthElement(node1, 3);
        ln.print(node1);*/

        LL_Leet_DeleteNthFromEnd ln2 = new LL_Leet_DeleteNthFromEnd();
        Node node21 = new Node(1);
        ln.insertLast(null, node1);
        removeNthFromEnd(node1, 1);
        ln.print(node1);

    }
}
