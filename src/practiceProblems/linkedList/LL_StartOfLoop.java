package practiceProblems.linkedList;

public class LL_StartOfLoop {

    private static class Node {

        int val;
        Node next;

        Node (int val) {

            this.val = val;
        }
    }

    static Node startOfLoop (Node head) {

        if (head == null || head.next == null)
            return head;

        Node slow = head, fast = head;
        boolean loop =  false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loop = true;
                break;
            }
        }

        if (!loop)
            return null;
        else {
            slow = head;

            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        return slow;

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

    public static void main (String[] args) {

        LL_StartOfLoop ln = new LL_StartOfLoop();

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
        node10.next = node5;
        System.out.println();
        Node loopNode = startOfLoop(node1);
        System.out.println(loopNode.val);


    }
}
