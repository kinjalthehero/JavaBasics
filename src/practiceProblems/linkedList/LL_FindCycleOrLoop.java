package practiceProblems.linkedList;

public class LL_FindCycleOrLoop {
    
	private Node head;
	
    public static class Node {
        private Node next;
        private String data;

        public Node(String data) {
            this.data = data;
        }

        public String data() { return data; }
        public void setData(String data) { this.data = data;}

        public Node next() { return next; }
        public void setNext(Node next) { this.next = next; }

    }

    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    static boolean detectLoop (Node head) {

        Node fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        LL_FindCycleOrLoop list = new LL_FindCycleOrLoop();
        Node head=new Node("a");
        list.addToTheLast(head);
        Node headb=new Node("b");
        Node headc=new Node("c");
        Node headd=new Node("d");
        Node heade=new Node("e");

        list.addToTheLast(headb);
        list.addToTheLast(headc);
        list.addToTheLast(headd);
        list.addToTheLast(heade);
        heade.next = headb;

        System.out.println("Linked list palidrome: "+ detectLoop(head));

        heade.next = null;
        System.out.println("Linked list palidrome: "+ detectLoop(head));
    }
}