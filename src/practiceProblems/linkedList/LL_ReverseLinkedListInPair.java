package practiceProblems.linkedList;

public class LL_ReverseLinkedListInPair{
	 
	private Node head;
 
	private static class Node {
		private int value;
		private Node next;
 
		Node(int value) {
			this.value = value;
 
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
 
 
	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public static Node reverseInPairs_orig (Node head) {

		Node curr = head;
		Node temp;
		Node future;

		if (head == null || head.next == null)
			return head;

		Node newHead = curr.next;

		while (true) {

			temp = curr.next;
			future = temp.next;
			temp.next = curr;

			if (future == null || future.next == null) {
				curr.next = future;
				break;
			}

			curr.next = future.next;
			curr = future;
		}

		return newHead;

	}

	public static Node reverseInPairs (Node head) {

		Node curr = head;
		Node future;

		if (head == null || head.next == null)
			return head;

		Node newHead = curr.next;

		while (true) {

			future = curr.next.next;
			curr.next.next = curr;

			if (future == null || future.next == null) {
				curr.next = future;
				break;
			}

			curr.next = future.next;
			curr = future;
		}

		return newHead;

	}

	static Node reverseInPairs_recursive (Node head) {

		if (head == null || head.next == null)
			return head;

		Node newHead = head.next;
		head.next = reverseInPairs_recursive(newHead.next);
		newHead.next = head;

		return newHead;
	}
 
	public static void main(String[] args) {
		LL_ReverseLinkedListInPair list = new LL_ReverseLinkedListInPair();
		
		Node head=new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
		list.addToTheLast(new Node(8));
 
		list.printList(head);

		Node result2=reverseInPairs_recursive(head);

		System.out.println("After reversing in pair");
		list.printList(result2);
	}
}