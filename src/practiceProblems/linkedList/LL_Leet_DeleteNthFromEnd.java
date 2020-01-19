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

    static Node nthElement (Node head, int pos) {

        Node slow = head;
        Node fast = head;

        while (pos != 0) {

            fast = fast.next;
            pos--;
        }

        if (fast.next == null)
            return head.next;

        while (fast.next != null) {

            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public static void main (String[] args) {

        LL_Leet_DeleteNthFromEnd ln = new LL_Leet_DeleteNthFromEnd();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
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
        ln.print(node1);
    }
}
