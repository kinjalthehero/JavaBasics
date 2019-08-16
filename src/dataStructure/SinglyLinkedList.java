package dataStructure;

public class SinglyLinkedList
{
    Node head;

    static class Node
    {
        int data;
        Node next;

        Node (int d)
        {
            data = d;
            next = null;
        }
    }

    public Node  findStartNodeOfTheLoop()
    {
        Node fast = head;
        Node slow = head;
        boolean loopExists=false;

        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast)
            {
                loopExists = true;
                break;
            }
        }

        if(loopExists)
        {
            slow = head;

            while(slow != fast)
            {
                slow = slow.next;
                fast = fast.next;
            }
        }
        else
        {
            System.out.println("Loop does not exists");
            slow=null;
        }
        return slow;
    }


    public void insertNodeLast(Node new_node)
    {

        if (head == null)
        {
            head = new_node;
        }
        else
        {
            Node curr = head;

            while (curr.next != null)
                curr = curr.next;

            curr.next = new_node;
        }
    }

    public void print ()
    {

        Node curr = head;

        // Traverse till the last node
        // CAREFUL: Condition uses last and not last.next
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;

        }
        System.out.println();
    }

    // Iteration
    public int length_iterative()
    {
        int count=0;
        Node current = head;

        while(current != null)
        {
            count++;
            current=current.next;
        }
        return count;
    }

    // Recursion
    public int length_recursion (Node current)
    {
        if(current == null)
        {
            return 0;
        }

        return 1+ length_recursion(current.next);
    }

    int length ()
    {
        int count = 0;
        Node curr = head;

        while (curr != null)
        {
            count++;
            curr = curr.next;
        }

        return count;
    }

    int lengthrec(Node curr)
    {
        if (curr == null)
            return 0;

        return (1 + lengthrec(curr.next));
    }

    // Find middle element in linkedlist
    public static Node findMiddleNode(Node head) {

        Node slowPointer, fastPointer;
        slowPointer = fastPointer = head;

        while(fastPointer != null)
        {
            fastPointer = fastPointer.next;

            if(fastPointer != null && fastPointer.next != null)
            {
                fastPointer = fastPointer.next;
                slowPointer = slowPointer.next;
            }
        }
        return slowPointer;
    }


    public static Node reverseLinkedList(Node currentNode) {
        // For first node, previousNode will be null
        Node previousNode=null;
        Node nextNode;
        while(currentNode!=null)
        {
            nextNode=currentNode.next;
            // reversing the link
            currentNode.next=previousNode;
            // moving currentNode and previousNode by 1 node
            previousNode=currentNode;
            currentNode=nextNode;
        }
        return previousNode;
    }


    // Function to check if linked list is palindrome or not
    public static boolean checkPalindrome (Node head) {
        // Find middle node using slow and fast pointer
        Node middleNode = findMiddleNode(head);

        // we got head of second part
        Node secondHead = middleNode.next;

        // It is end of first part of linked list
        middleNode.next = null;

        // get reversed linked list for second part
        Node reverseSecondHead = reverseLinkedList(secondHead);


        // Verify each node's data. They all should be the same
        while(head!=null && reverseSecondHead!=null) {
            if(head.data == reverseSecondHead.data) {
                head=head.next;
                reverseSecondHead = reverseSecondHead.next;
                continue;
            }
            else {
                return false;
            }
        }


        return true;
    }

    public static void main (String[] args) {

        SinglyLinkedList ln = new SinglyLinkedList();

        ln.insertNodeLast(new Node(1));
        ln.insertNodeLast(new Node(2));
        ln.insertNodeLast(new Node(3));
        ln.insertNodeLast(new Node(2));
        ln.insertNodeLast(new Node(1));
        ln.print();
        System.out.println(ln.checkPalindrome(ln.head));


        //ln.print();

        /*ln.insertAfterANode(1, 20);
        ln.print();
        System.out.println();

        ln.insertAfterANode(5, 20);
        ln.print();
        System.out.println();

        ln.insertAfterANode(10, 20);
        ln.print();
        System.out.println();

        ln.insertAfterANode(100, 21);
        ln.print();
        System.out.println();

        System.out.println("Inserting 30 before 1");
        ln.insertBeforeANode(1, 30);
        ln.print();
        System.out.println();

        System.out.println("Inserting 5 before 30");
        ln.insertBeforeANode(5, 30);
        ln.print();
        System.out.println();

        System.out.println("Inserting 10 before 30");
        ln.insertBeforeANode(10, 30);
        ln.print();
        System.out.println();

        System.out.println("Inserting 100 before 31");
        ln.insertBeforeANode(100, 31);
        ln.print();
        System.out.println();

        System.out.println("Deleting 5");
        ln.deleteANode(5);
        ln.print();
        System.out.println();

        System.out.println("Deleting 1");
        ln.deleteANode(1);
        ln.print();
        System.out.println();

        System.out.println("Deleting 21");
        ln.deleteANode(21);
        ln.print();
        System.out.println();

        System.out.println("Deleting 20");
        ln.deleteANode(20);
        ln.print();
        System.out.println();

        System.out.println("Deleting 20");
        ln.deleteANode(20);
        ln.print();
        System.out.println();

        System.out.println("Deleting 20");
        ln.deleteANode(20);
        ln.print();
        System.out.println();

        System.out.println("Deleting at position 0");
        ln.deleteAtPosition(0);
        ln.print();
        System.out.println();

        System.out.println("Deleting at position 2");
        ln.deleteAtPosition(2);
        ln.print();
        System.out.println();

        System.out.println("Deleting at position 8");
        ln.deleteAtPosition(8);
        ln.print();
        System.out.println();

        System.out.println("Find length using recursion");
        System.out.println(ln.length_recursion(ln.head));

        System.out.println("Find length using iteration");
        System.out.println(ln.length_iterative());*/
    }
}

