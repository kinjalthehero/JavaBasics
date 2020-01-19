package practiceProblems.linkedList;

class SinglyLinkedList {
  
	  private Node head;

	public String getNthFromEndNode (int n)
	{
		Node fast = head;
		Node slow = head;
		int start = 0;

		while (fast.next != null)
		{
			fast = fast.next;
			start++;

			if (start >= n)
				slow = slow.next;
		}

		return slow.data;
	}

	public Node nthFromLastNode(int n)
	{
		Node fast = head;
		Node slow = head;

		for (int i = 0; i < n; i++)
		{
			fast = fast.next;
		}

		while(fast!=null)
		{
			fast=fast.next;
			slow=slow.next;
		}

		return slow;
	}
	  
	  static class Node {
		  private Node next;
		  private String data;
	
		  public Node(String data) {
			  this.data = data;
		  }
	
		  @Override
		  public String toString() {
			  return data.toString();
		  }
	  }
	
	  public void append(String data) {
		  if (head == null) {
			  head = new Node(data);
			  return;
		  }
		  tail().next = new Node(data);
	  }
	
	  private Node tail() {
		  Node tail = head;
		  
		  // Find last element of linked list known as tail
		  while (tail.next != null) 
			  tail = tail.next;

		  return tail;
	  }
	
	  public int length() {
		  int length = 0;
		  Node current = head;
	
		  while (current != null) {
			  length++;
			  current = current.next;
		  }
		  return length;
	  }
}

public class LL_KthElementFromEnd {
	
	public static void main(String args[]) {
		
		SinglyLinkedList list = new SinglyLinkedList();
	    list.append("1");
	    list.append("2");
	    list.append("3");
	    list.append("4");
	
	    System.out.println("linked list : " + list);
	
	    System.out.println("The first node from last: " + list.nthFromLastNode(1));
	    System.out.println("The second node from the end: " + list.nthFromLastNode(2));
	    System.out.println("The third node from the tail: " + list.nthFromLastNode(3));
		System.out.println("The first node from last: " + list.getNthFromEndNode(1));
		System.out.println("The second node from the end: " + list.getNthFromEndNode(2));
		System.out.println("The third node from the tail: " + list.getNthFromEndNode(3));

	}
}
