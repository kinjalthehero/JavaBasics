package practiceProblems.linkedList;

public class Delete {

    //static Node head = null;

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

	//TODO: This is void if LL is pass by reference similar to Array
    void insertFirst (Node head, Node newNode) {

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

	//TODO: Verify number of input parameters
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

    //Insert after a node,
    void insertAfterANode (Node head, Node node, Node newNode) {

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp!= null && temp != node) {
            temp = temp.next;
        }

        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Could not find " + node.val);
        }

    }

    //Insert before a node
    void insertBeforeNode (Node head, Node node, Node newNode) {

        if (node == head) {

            newNode.next = head;
            head = newNode;
        }

        Node temp = head;
        Node prev = null;

        while (temp!= null && temp != node) {
            prev = temp;
            temp = temp.next;
        }

        if (temp != null) {
            prev.next = newNode;
            newNode.next = temp;
        } else {
            System.out.println("Could not find " + node.val);
        }
    }

    // Delete first
    void deleteFirst (Node head) {
        head = head.next;
    }

    // Delete a node
    void deleteNode (Node head, Node node) {

        if (node == head) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp!= null && temp != node) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }

    // Delete by position
    Node deleteAtPosition (Node head, int pos) {

        int currPos = 1;
        Node temp = head;
        Node prev = null;

        if (pos == 1) {
            head = head.next;
            return head;
        }

        while (temp != null && currPos != pos) {
            prev = temp;
            temp = temp.next;
            currPos++;
        }

        if (temp != null)
            prev.next = temp.next;

        return head;
    }

    // Delete after a node
    void deleteAfterNode (Node head, Node node) {

        Node temp = head;

        while (temp != null && temp != node) {

            temp = temp.next;
        }

        if (node != null && node.next != null) {
            temp.next = temp.next.next;
        } else if (node.next == null) {
            System.out.println("No node after " + node.val);
        } else {
                System.out.println("Could not find the node: " + node.val);
            }

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

    static void middleNode (Node head) {

        if (head == null || head.next == null)
            return;

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.val);

    }

    public static void main (String[] args) {

        Delete ln = new Delete();

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

        ln.insertFirst(null, node1);
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

        Node node20 = new Node(20);
        System.out.println("Inserting 20 after 1");
        ln.insertAfterANode(node1, node1, node20);
        ln.print(node1);
        ln.length(node1);
        System.out.println();
        System.out.println();

        Node node21 = new Node(21);
        System.out.println("Inserting 21 after 5");
        ln.insertAfterANode(node1, node5, node21);
        ln.print(node1);
        ln.length(node1);
        System.out.println();
        System.out.println();

        Node node22 = new Node(22);
        System.out.println("Inserting 22 after 10");
        ln.insertAfterANode(node1, node10, node22);
        ln.print(node1);
        ln.length(node1);
        System.out.println();
        System.out.println();

        Node node23 = new Node(23);
        Node node100 = new Node(100);
        System.out.println("Inserting 23 after 100");
        ln.insertAfterANode(node1, node100, node23);
        ln.print(node1);
        ln.length(node1);
        System.out.println();
        System.out.println();

        Node node30 = new Node(30);
        System.out.println("Inserting 30 before 1");
        ln.insertBeforeNode(node1, node1, node30);
        ln.print(node30);
        ln.length(node30);
        System.out.println();

        Node node31 = new Node(31);
        System.out.println("Inserting 31 before 5");
        ln.insertBeforeNode(node30, node5, node31);
        ln.print(node30);
        ln.length(node30);
        System.out.println();

        Node node32 = new Node(32);
        System.out.println("Inserting 32 before 22");
        ln.insertBeforeNode(node30, node22, node32);
        ln.print(node30);
        ln.length(node30);
        System.out.println();

        Node node33 = new Node(33);
        Node node101 = new Node(101);
        System.out.println("Inserting 33 before 101");
        ln.insertBeforeNode(node30, node101, node33);
        ln.print(node30);
        ln.length(node30);
        System.out.println();

        System.out.println("Deleting 30");
        ln.deleteNode(node30, node30);
        ln.print(node1);
        ln.length(node1);
        System.out.println();

        System.out.println("Deleting 22");
        ln.deleteNode(node1, node22);
        ln.print(node1);
        ln.length(node1);
        System.out.println();

        System.out.println("Deleting 31");
        ln.deleteNode(node1, node31);
        ln.print(node1);
        ln.length(node1);
        System.out.println();

        System.out.println("Deleting head node");
        ln.deleteFirst(node1);
        ln.print(node20);
        ln.length(node20);
        System.out.println();

        System.out.println("Deleting at first position");
        Node head = ln.deleteAtPosition(node3, 1);
        ln.print(head);
        ln.length(head);
        System.out.println();

        System.out.println("Deleting at position 6");
        ln.deleteAtPosition(node3,6);
        ln.print(node3);
        ln.length(node3);
        System.out.println();

        System.out.println("Deleting at last position");
        ln.deleteAtPosition(node3,10);
        ln.print(node3);
        ln.length(node3);
        System.out.println();

        System.out.println("Deleting after the head node");
        ln.deleteAfterNode(node3,node2);
        ln.print(node3);
        ln.length(node3);
        System.out.println();

        System.out.println("Deleting after Node 5");
        ln.deleteAfterNode(node3,node5);
        ln.print(node3);
        ln.length(node3);
        System.out.println();

        System.out.println("Deleting after last position");
        ln.deleteAfterNode(node3,node32);
        ln.print(node3);
        ln.length(node3);
        System.out.println();


        /*System.out.println("Find length using recursion");
        System.out.println(ln.length_recursion(ln.head));

        System.out.println("Find length using iteration");
        System.out.println(ln.length_iterative());*/
    }
}
