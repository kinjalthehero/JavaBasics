package practiceProblems;

class LL_Node {
	
	public int data;
	public LL_Node next;
 
	public void displayNodeData() {
		System.out.println("{ " + data + " } ");
	}
}
 
public class LL_Length {
	private LL_Node head;
 
	// Find length of linked list using iterative method
	public int lengthOfLinkedList_iterative() {
		
		LL_Node temp = head;
		int count = 0;
		
		while(temp!=null) {
			temp = temp.next;
			count++;  
		}
	    return count;
	}
	
	// Find length of linked list using recursion 
	public int lengthOfLinkedList_recursion(LL_Node head) {
	   
		LL_Node temp=head;
		
		if(temp==null) 
			return 0;
		else
			return 1 + lengthOfLinkedList_recursion(temp.next);
	}
}
