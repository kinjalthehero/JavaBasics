package PracticeProblems;

// Without using recursion.
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
    linkedlist.reverse();

    // printing the singly linked list again
    linkedlist.print();

  }

}

class SinglyLL {

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

  // without recursion
  public void reverse() {
	  
	  Node pointer = head;
	  Node previous = null, current = null;
	
	  while (pointer != null) {
		  
		  // store pointer of the node we are procesing  
		  current = pointer;
		  // move the pointer ahead for the next iteration before we start processing
		  pointer = pointer.next;
	
		  // Point to the previous node
		  current.next = previous;
		  // Keep making all new nodes as head so that last node will become head
		  head = current;
		  // Linking is done. Now preparation for next iteration. Current node will become previous.   
		  previous = current;
		  
	  }
  }
}
