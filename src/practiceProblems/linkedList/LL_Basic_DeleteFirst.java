package practiceProblems.linkedList;

public class LL_Basic_DeleteFirst {

    private static class Node {

        int val;
        Node next;

        Node (int val) {

            this.val = val;
        }
    }

    // Delete first
    Node deleteFirst (Node head) {
        head = head.next;
        return head;
    }

    void print (Node head) {

        Node temp = head;

		while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

	//TODO: Verify number of input parameters
    Node insertLast (Node head, Node node) {

        Node temp = head;

        if (temp == null) {
            return head;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;

        return head;
    }

    // Length
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

        LL_Basic_DeleteFirst ln = new LL_Basic_DeleteFirst();

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
        System.out.println();

        System.out.println("Deleting head node");
        Node head = ln.deleteFirst(node1);
        ln.print(head);
        System.out.println();
        ln.length(head);
        System.out.println();
    }
}
