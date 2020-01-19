package practiceProblems.linkedList;

public class LL_MiddleNode {

    private static class Node {

        int val;
        Node next;

        Node (int val) {

            this.val = val;
        }
    }

    static Node middleNode (Node head) {

        if (head == null || head.next == null)
            return head;

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static Node findMiddleNode(Node head)
    {
        Node slow = head;
        Node fast = head;

        while (fast != null)
        {
            fast = fast.next;

            if (fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next;
            }
        }

        return slow;
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

    public static void main (String[] args) {

        LL_MiddleNode ln = new LL_MiddleNode();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);

        ln.insertLast(null, node1);
        ln.insertLast(node1, node2);
        ln.insertLast(node1, node3);
        ln.insertLast(node1, node4);
        ln.insertLast(node1, node5);
        ln.insertLast(node1, node6);
        ln.insertLast(node1, node7);
        ln.insertLast(node1, node8);
        ln.insertLast(node1, node9);
        ln.insertLast(node1, node10);
        ln.print(node1);
        System.out.println();
        ln.length(node1);

        System.out.println(middleNode(node1).val);
        System.out.println(findMiddleNode(node1).val);
    }
}
