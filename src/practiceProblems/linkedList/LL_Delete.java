package practiceProblems.linkedList;

public class LL_Delete {
	 
	private Node head;
 
	private static class Node {
		private int val;
		private Node next;
 
		Node(int value) {
			this.val = value;
 
		}
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

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.val);
			temp = temp.next;
		}
		System.out.println();
	}

	public boolean isPalindrome(Node head) {

		if (head == null || head.next == null)
			return true;

		Node middle = middleNode(head);

		Node rightHead = middle.next;
		middle.next = null;

		rightHead = reverse (rightHead);

		return compare (middle, rightHead);
	}

	public Node middleNode (Node head) {

		Node slow = head, fast = head;

		while (fast != null) {

			fast = fast.next;

			if (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next;
			}
		}

		return slow;
	}

	public Node reverse (Node head) {

		if (head == null || head.next == null)
			return head;

		Node reverseList = reverse(head.next);
		head.next.next = head;
		head.next = null;

		return reverseList;

	}

	public boolean compare (Node node1, Node node2) {

		while (node1 != null && node2 != null) {

			if (node1.val != node2.val)
				return false;

			node1 = node1.next;
			node2 = node2.next;
		}

		return true;
	}
	
	public static void main(String[] args) {
		LL_Delete list = new LL_Delete();
		Node head=new Node(1);
		list.addToTheLast(head);
		list.addToTheLast(new Node(2));
		list.addToTheLast(new Node(3));
		list.addToTheLast(new Node(2));
		list.addToTheLast(new Node(1));

 
		list.printList();
 
		System.out.println("Linked list palidrome: "+ list.isPalindrome(head));
	}
}
