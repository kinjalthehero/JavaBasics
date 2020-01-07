package practiceProblems.linkedList;

public class LL_Intersection {

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

    static Node getIntersectionNode(Node headA, Node headB) {

        int lengthA = 0;
        int lengthB = 0;
        Node tempA = headA;
        Node tempB = headB;

        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        System.out.println("Length of LL 1: " + lengthA);
        System.out.println("Length of LL 2: " + lengthB);

        int diff = Math.abs(lengthA-lengthB);

        System.out.println("Difference: " + diff);

        tempA = headA;
        tempB = headB;

        if (lengthA > lengthB) {
            while (diff != 0) {
                tempA = tempA.next;
                diff--;
            }
        } else if (lengthA < lengthB) {
            while (diff != 0) {
                tempB = tempB.next;
                diff--;
            }
        }

        while (tempA != null && tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return (tempA == null) ? null: tempA;
    }

    public static void main (String[] args) {

        LL_Intersection ln = new LL_Intersection();

        Node node11 = new Node(4);
        Node node12 = new Node(1);
        Node node8 = new Node(8);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        ln.insertLast(null, node11);
        ln.insertLast(node11, node12);
        ln.insertLast(node11, node8);
        ln.insertLast(node11, node4);
        ln.insertLast(node11, node5);
        ln.print(node11);
        System.out.println();

        Node node21 = new Node(5);
        Node node22 = new Node(0);
        Node node23 = new Node(1);

        ln.insertLast(null, node21);
        ln.insertLast(node21, node22);
        ln.insertLast(node21, node23);
        ln.insertLast(node21, node8);
        ln.print(node21);
        System.out.println();

        System.out.println(getIntersectionNode(node11, node21).val);

    }
}
