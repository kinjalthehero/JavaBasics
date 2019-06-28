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
	
	// Insert node at the end of the list
	public LinkedList insert (LinkedList list ,int data) {
		
		// Create new node with data in it
		Node new_node = new Node(data);
		
		// If list is empty then make newnode as head
		if (list.head == null)
			list.head = new_node;
		else {
			Node curr = list.head; 
			
			// Go till last node and attach new_node to the last node
			while (curr.next != null)
				curr = curr.next;
			
			curr.next = new_node;
		}
		
		return list;
	}
	
	public LinkedList insertAfterANode(LinkedList list, int insertAfterNodeData, int data) {
		
		// Create a new node
		Node newNode = new Node(data);
		
		// Get a temp pointer
		Node curr = list.head;
		
		while (curr !=null && curr.data != insertAfterNodeData)
			curr = curr.next;
		
		if (curr != null) {
			newNode.next = curr.next;
			curr.next = newNode;
		}
		
		return list;
		
	}
	
	public LinkedList insertBeforeANode (LinkedList list, int insertBefore, int data) {
		
		// Create a new node
		Node newNode = new Node(data);
		
		// If list is empty return the empty list
		if (list.head == null)
			return list;
		
		// If node to be inserted before head node
		if (list.head.data == insertBefore) {
			
			newNode.next = list.head;
			list.head = newNode;
			return list;
		}
		
		// When inserted before temp node, use prev node to keep track of the traversal
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
		
		Node curr = list.head;
		
		// Traverse till the last node
		// CAREFUL: Condition uses last and not last.next
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
			
		}
		System.out.println();
	}
	
	public LinkedList deleteANode (LinkedList list, int data) {
		
		// If list is empty return an empty list
		if (list.head == null) {
			System.out.println("List is empty");
			return list;
		}
		
		// Only 1 node in the list
		if (list.head.next == null) {
			list.head = null;
			return list;
		}
		
		// Delete middle or a last node
		Node prev = null;
		Node curr = list.head;
		
		// Go wither till data is found
		// or last node has been reached
		while (curr != null && curr.data != data) {
			prev = curr;
			curr = curr.next;
		}
		
		if (curr!= null) {
			prev.next = curr.next;
		}
		
		return list;
	}
	  
    // Method to delete a node in the LinkedList by KEY 
    public LinkedList deleteByKey(LinkedList list, int key) { 

    	// Point to head node of the list 
        Node currNode = list.head;
        Node prev = null; 
  
        // CASE 1: List is empty
        if (currNode == null)
        	return list;
        
        // CASE 2: If head node itself holds the key to be deleted 
        if (currNode.data == key) { 
            list.head = currNode.next; // Changed head 
            return list; 
        } 
  
        // CASE 3: If the key is somewhere other than at head 
        while (currNode != null && currNode.data != key) { 
            prev = currNode; 
            currNode = currNode.next; 
        } 
  
        if (currNode != null)  
            prev.next = currNode.next; 
         
        return list; 
    } 
     
    public LinkedList deleteAtPosition(LinkedList list, int index) { 
    
    	// Store head node 
        Node currNode = list.head;
        Node prev = null; 
        
        if (currNode == null) 
        	return list;
  
        // CASE 1: If index is 0, then head node itself is to be deleted 
        if (index == 0) { 
            list.head = currNode.next; 
            return list; 
        } 
  
        // CASE 2: If the index is greater than 0 but less than the size of LinkedList 
        int index_counter = 0; 
  
        while (currNode != null) { 
            if (index_counter == index) { 
                prev.next = currNode.next; 
                break; 
            } else { 
                prev = currNode; 
                currNode = currNode.next; 
                index_counter++; 
            } 
        } 
    
        return list; 
    } 
    
    // Iteration
    public int length_iterative() {
        int count=0;
        Node current = this.head;


        while(current != null){
            count++;
            current=current.next;
        }
        return count;
    }

    // Recursion
    public int length_recursion (Node current) {
        if(current == null){ //base case
            return 0;
        }
        
        return 1+ length_recursion(current.next);
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
		
		ln.insertAfterANode(ln, 1, 20);
		ln.print(ln);
		System.out.println();
		
		ln.insertAfterANode(ln, 5, 20);
		ln.print(ln);
		System.out.println();
		
		ln.insertAfterANode(ln, 10, 20);
		ln.print(ln);
		System.out.println();
		
		ln.insertAfterANode(ln, 100, 21);
		ln.print(ln);
		System.out.println();
		
		System.out.println("Inserting before 1 before 30");
		ln.insertBeforeANode(ln, 1, 30);
		ln.print(ln);
		System.out.println();
		
		System.out.println("Inserting before 30 before 5");
		ln.insertBeforeANode(ln, 5, 30);
		ln.print(ln);
		System.out.println();
		
		System.out.println("Inserting before 30 before 10");
		ln.insertBeforeANode(ln, 10, 30);
		ln.print(ln);
		System.out.println();
		
		System.out.println("Inserting before 31 before 100");
		ln.insertBeforeANode(ln, 100, 31);
		ln.print(ln);
		System.out.println();
		
		System.out.println("Deleting 5");
		ln.deleteByKey(ln,5); 
		ln.print(ln); 
		System.out.println();
		
		System.out.println("Deleting 1");
		ln.deleteByKey(ln,1); 
		ln.print(ln);
		System.out.println();
		
		System.out.println("Deleting 21");
		ln.deleteByKey(ln,21); 
		ln.print(ln); 
		System.out.println();
		
		System.out.println("Deleting 20");
		ln.deleteByKey(ln,20); 
		ln.print(ln);
		System.out.println();
		
		System.out.println("Deleting 20");
		ln.deleteByKey(ln,20); 
		ln.print(ln);
		System.out.println();
		
		System.out.println("Deleting 20");
		ln.deleteByKey(ln,20); 
		ln.print(ln);
		System.out.println();
		
		System.out.println("Deleting at position 0");
		ln.deleteAtPosition(ln, 0); 
		ln.print(ln);
		System.out.println();
		
		System.out.println("Deleting at position 2");
		ln.deleteAtPosition(ln, 2); 
		ln.print(ln);
		System.out.println();
		
		System.out.println("Deleting at position 8");
		ln.deleteAtPosition(ln, 8); 
		ln.print(ln);
		System.out.println();
		
		System.out.println("Find length using recursion");
		System.out.println(ln.length_recursion(ln.head));
		
		System.out.println("Find length using iteration");
		System.out.println(ln.length_iterative());
	}
}
