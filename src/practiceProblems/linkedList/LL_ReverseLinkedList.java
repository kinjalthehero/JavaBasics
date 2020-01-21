package practiceProblems.linkedList;

import dataStructure.SinglyLinkedList;

/*class SinglyLL {
	



	
}*/

//Without using recursion.
public class LL_ReverseLinkedList {

	public static Node reverseLinkedList (Node curr)
	{
		Node prev = null;
		Node next;

		while (curr != null)
		{
			// saving next node’s position for next iteration
			next = curr.next;

			// reverse
			curr.next = prev;

			// prep for next iteration. Make curr node prev and next node curr
			prev = curr;
			curr = next;
		}

		// NOTICE: Don’t return curr
		// return prev because curr node is null from while loop
		return prev;
	}

	public static Node reverseLinkedList_rec (Node node)
	{
		// base case
		if (node == null || node.next == null)
			return node;

		Node remaining = reverseLinkedList_rec (node.next);
		node.next.next = node;
		node.next = null;

		return remaining;
	}

	static class Node {

		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		public int data() {
			return data;
		}

		public Node next() {
			return next;
		}
	}

	private Node head;

	public LL_ReverseLinkedList(Node head) {
		this.head = head;
	}

	public void add(Node node) {

		Node current = head;
		while (current != null) {
			if (current.next == null) {
				current.next = node;
				break;
			}
			current = current.next;
		}
	}

	public void print() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data() + " ");
			node = node.next();
		}
		System.out.println("");
	}

	public void print(Node node) {
		//Node node = dummyHead;
		while (node != null) {
			System.out.print(node.data() + " ");
			node = node.next();
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		Node head = new Node(1);
		LL_ReverseLinkedList linkedlist = new LL_ReverseLinkedList(head);

		linkedlist.add(new Node(2));
		linkedlist.add(new Node(3));

		linkedlist.print();

		// reversing the singly linked list
		//linkedlist.reverse();

		//SinglyLL.Node reversedHead = linkedlist.reverseLinkedList(dummyHead);
		Node reversedHead = linkedlist.reverseLinkedList_rec(head);

		linkedlist.print(reversedHead);
	}

}
