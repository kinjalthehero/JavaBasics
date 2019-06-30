package practiceProblems;

class SinglyLinkedList {
  
	  private Node head; 
		  
	  // to get the nth node from end
	  public String getNthNodeFromLast(int n) {
		  
		  Node firstPtr=head;
		  Node secondPtr=head;
	
		  // This will keep n distance between fast and slow
		  // When fast will reach to the end, slow will be n distance away from fast
		  for (int i = 0; i < n; i++) {
				firstPtr=firstPtr.next;
		  }
	
		  while(firstPtr!=null) {
				firstPtr=firstPtr.next;
				secondPtr=secondPtr.next;
		  }
	
		  return secondPtr.data;
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
	
	    System.out.println("The first node from last: " + list.getNthNodeFromLast(1));
	    System.out.println("The second node from the end: " + list.getNthNodeFromLast(2));
	    System.out.println("The third node from the tail: " + list.getNthNodeFromLast(3));
	}
}
