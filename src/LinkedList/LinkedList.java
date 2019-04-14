package LinkedList;

public class LinkedList {
		
	Node head;
	
	class Node {
		
		int data;
		Node next;
		
		Node (int d) {
			data = d;
			next = null;
		}
	}
	
	
	public LinkedList insert (LinkedList list ,int data) {
		
		// Create new node with data in it
		Node new_node = new Node(data);
		
		// If list is empty then make newnode as head
		if (list.head == null)
			list.head = new_node;
		else {
			// Go till last node and attach newnode to the last node
			Node last = list.head;
			
			while (last.next != null)
				last = last.next;
			
			last.next = new_node;
		}
		
		return list;
	}
	
	public LinkedList insertAfterKey (LinkedList list, int insertAfter, int insertData) {
		
		System.out.println("Insert " + insertData + " after " + insertAfter);
		Node newNode = new Node(insertData);
		Node curr = list.head;
		
		while (curr !=null && curr.data != insertAfter)
			curr = curr.next;
		
		if (curr != null) {
			newNode.next = curr.next;
			curr.next = newNode;
		}
		
		return list;
		
	}
	
	public LinkedList insertBefore (LinkedList list, int insertBefore, int insertElement) {
		
		System.out.println("Insert " + insertElement + " before " + insertBefore);
		
		Node newNode = new Node(insertElement);
		
		if (list.head == null)
			return list;
		
		if (list.head.data == insertBefore) {
			newNode.next = list.head;
			list.head = newNode;
			return list;
		}
		
		Node prev = null;
		Node curr = list.head;
		
		while (curr != null && curr.data != insertBefore) {
			prev = curr;
			curr = curr.next;
		}
		
		if (curr!= null) {
			prev.next = newNode;
			newNode.next = curr;
		}
			
		return list;
	}
	
	
	public void print (LinkedList list) {
		
		Node last = list.head;
		
		// Traverse till the last node
		// CAREFUL: Condition uses last and not last.next
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.next;
			
		}
		System.out.println();
	}
	
	public LinkedList deleteANode (LinkedList list, int data) {
		
		if (list.head == null) {
			System.out.println("List is empty");
			return list;
		}
			
		if (list.head.next == null) {
			list.head = null;
			return list;
		}
		
		Node prev = null;
		Node curr = list.head;
		
		while (curr.data != data && curr.next != null) {
			prev = curr;
			curr = curr.next;
		}
		
		prev.next = curr.next;	
		
		return list;
	}
	
	public static void main (String[] args) {
		
		LinkedList ln = new LinkedList();
		ln.insert(ln, 1);
		ln.insert(ln, 2);
		ln.insert(ln, 3);
		ln.insert(ln, 4);
		ln.insert(ln, 5);
		ln.insert(ln, 6);
		ln.insert(ln, 7);
		ln.insert(ln, 8);
		ln.insert(ln, 9);
		ln.insert(ln, 10);
		
		ln.insertAfterKey(ln, 1, 20);
		ln.print(ln);
		ln.insertAfterKey(ln, 5, 20);
		ln.print(ln);
		ln.insertAfterKey(ln, 10, 20);
		ln.print(ln);
		ln.insertAfterKey(ln, 100, 21);
		ln.print(ln);
		
		ln.insertBefore(ln, 1, 30);
		ln.print(ln);
		ln.insertBefore(ln, 5, 30);
		ln.print(ln);
		ln.insertBefore(ln, 10, 30);
		ln.print(ln);
		ln.insertBefore(ln, 100, 31);
		ln.print(ln);
		
		
		/*
		 * ln.deleteANode(ln,5); ln.print(ln); ln.deleteANode(ln,1); ln.print(ln);
		 * ln.deleteANode(ln,21); ln.print(ln); ln.deleteANode(ln,200); ln.print(ln);
		 */
		
	}
	
	
	
	

}
