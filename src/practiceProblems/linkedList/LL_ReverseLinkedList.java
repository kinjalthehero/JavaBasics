package practiceProblems.linkedList;

import dataStructure.SinglyLinkedList;

class SinglyLL {
	

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

	public SinglyLL(Node head) {
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
		//Node node = head;
		while (node != null) {
			System.out.print(node.data() + " ");
			node = node.next();
		}
		System.out.println("");
	}

	
}

//Without using recursion.
public class LL_ReverseLinkedList {

	public static void main(String[] args) {
	
		// creating a singly linked list
		SinglyLL.Node head = new SinglyLL.Node(1);
		SinglyLL linkedlist = new SinglyLL(head);
	
		// adding node into singly linked list
		linkedlist.add(new SinglyLL.Node(2));
		linkedlist.add(new SinglyLL.Node(3));
		// printing a singly linked list
		linkedlist.print();
		
		// reversing the singly linked list
		//linkedlist.reverse();

		SinglyLL.Node reversedHead = linkedlist.reverseLinkedList(head);
		
		// printing the singly linked list again
		linkedlist.print(reversedHead);
	}

}
