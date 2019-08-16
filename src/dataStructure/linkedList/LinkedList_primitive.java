package dataStructure.linkedList;

public class LinkedList_primitive
{
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node (int d)
		{
			data = d;
			next = null;
		}
	}

	public void insertLast(int data)
	{

		Node new_node = new Node(data);

		if (head == null)
		{
			head = new_node;
		}
		else
		{
			Node curr = head;

			while (curr.next != null)
				curr = curr.next;
			
			curr.next = new_node;
		}
	}
	
	public void insertAfterANode(int insertAfterNodeData, int data)
	{

		Node newNode = new Node(data);

		Node curr = head;
		
		while (curr !=null && curr.data != insertAfterNodeData)
			curr = curr.next;
		
		if (curr != null)
		{
			newNode.next = curr.next;
			curr.next = newNode;
		}
	}
	
	public void insertBeforeANode (int insertBefore, int data)
	{
		
		// Create a new node
		Node newNode = new Node(data);
		
		// If list is empty return the empty list
		if (head == null)
			System.out.println("List is empty");
		
		// If node to be inserted before head node
		if (head.data == insertBefore)
		{
			newNode.next = head;
			head = newNode;
		}
		
		// When inserted before temp node, use prev node to keep track of the traversal
		Node prev = null;
		Node curr = head;
		
		while (curr != null && curr.data != insertBefore)
		{
			prev = curr;
			curr = curr.next;
		}
		
		if (curr!= null) {
			prev.next = newNode;
			newNode.next = curr;
		}
	}
	
	
	public void print ()
	{
		
		Node curr = head;
		
		// Traverse till the last node
		// CAREFUL: Condition uses last and not last.next
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
			
		}
		System.out.println();
	}
	
	public void deleteANode (int data)
	{
		
		// If list is empty return an empty list
		if (head == null)
		{
			System.out.println("List is empty");
		}
		
		// Only 1 node in the list
		if (head.next == null)
		{
			head = null;
		}
		
		// SinglyLinkedList middle or a last node
		Node prev = null;
		Node curr = head;
		
		while (curr != null && curr.data != data)
		{
			prev = curr;
			curr = curr.next;
		}
		
		if (curr!= null)
		{
			prev.next = curr.next;
		}
	}

    public void deleteByKey(int key)
	{
        Node currNode = head;
        Node prev = null; 

        // CASE 1: List is empty
        if (currNode == null)
        	System.out.println("List is empty");
        
        // CASE 2: If head node itself holds the key to be deleted 
        if (currNode.data == key)
        {
            head = currNode.next; // Changed head
        } 
  
        // CASE 3: If the key is somewhere other than at head 
        while (currNode != null && currNode.data != key)
        {
            prev = currNode; 
            currNode = currNode.next; 
        } 
  
        if (currNode != null)  
            prev.next = currNode.next;
    } 
     
    public void deleteAtPosition(int index)
	{
    	// Store head node 
        Node currNode = head;
        Node prev = null; 
        
        if (currNode == null) 
        	System.out.println("");
  
        // CASE 1: If index is 0, then head node itself is to be deleted 
        if (index == 0)
        {
            head = currNode.next;
            return;
        } 
  
        // CASE 2: If the index is greater than 0 but less than the size of LinkedList_primitive
        int index_counter = 0; 
  
        while (currNode != null)
        {
            if (index_counter == index)
            {
                prev.next = currNode.next; 
                break; 
            } else
            {
                prev = currNode; 
                currNode = currNode.next; 
                index_counter++; 
            } 
        }
    } 
    
    // Iteration
    public int length_iterative()
	{
        int count=0;
        Node current = this.head;

        while(current != null)
        {
            count++;
            current=current.next;
        }
        return count;
    }

    // Recursion
    public int length_recursion (Node current)
	{
        if(current == null)
        {
            return 0;
        }
        
        return 1+ length_recursion(current.next);
    }
	
	public static void main (String[] args) {
		
		LinkedList_primitive ln = new LinkedList_primitive();
		ln.insertLast(1);
		ln.insertLast(2);
		ln.insertLast(3);
		ln.insertLast(4);
		ln.insertLast(5);
		ln.insertLast(6);
		ln.insertLast(7);
		ln.insertLast(8);
		ln.insertLast(9);
		ln.insertLast(10);
		ln.print();
		
		ln.insertAfterANode(1, 20);
		ln.print();
		System.out.println();
		
		ln.insertAfterANode(5, 20);
		ln.print();
		System.out.println();
		
		ln.insertAfterANode(10, 20);
		ln.print();
		System.out.println();
		
		ln.insertAfterANode(100, 21);
		ln.print();
		System.out.println();
		
		System.out.println("Inserting 30 before 1");
		ln.insertBeforeANode(1, 30);
		ln.print();
		System.out.println();
		
		System.out.println("Inserting 5 before 30");
		ln.insertBeforeANode(5, 30);
		ln.print();
		System.out.println();
		
		System.out.println("Inserting 10 before 30");
		ln.insertBeforeANode(10, 30);
		ln.print();
		System.out.println();
		
		System.out.println("Inserting 100 before 31");
		ln.insertBeforeANode(100, 31);
		ln.print();
		System.out.println();
		
		System.out.println("Deleting 5");
		ln.deleteByKey(5);
		ln.print();
		System.out.println();
		
		System.out.println("Deleting 1");
		ln.deleteByKey(1);
		ln.print();
		System.out.println();
		
		System.out.println("Deleting 21");
		ln.deleteByKey(21);
		ln.print();
		System.out.println();
		
		System.out.println("Deleting 20");
		ln.deleteByKey(20);
		ln.print();
		System.out.println();
		
		System.out.println("Deleting 20");
		ln.deleteByKey(20);
		ln.print();
		System.out.println();
		
		System.out.println("Deleting 20");
		ln.deleteByKey(20);
		ln.print();
		System.out.println();
		
		System.out.println("Deleting at position 0");
		ln.deleteAtPosition(0);
		ln.print();
		System.out.println();
		
		System.out.println("Deleting at position 2");
		ln.deleteAtPosition(2);
		ln.print();
		System.out.println();
		
		System.out.println("Deleting at position 8");
		ln.deleteAtPosition(8);
		ln.print();
		System.out.println();
		
		System.out.println("Find length using recursion");
		System.out.println(ln.length_recursion(ln.head));
		
		System.out.println("Find length using iteration");
		System.out.println(ln.length_iterative());
	}
}
