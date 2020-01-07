package practiceProblems.linkedList;

public class LL_PalindromeCheck {
	 
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
 
 
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public static Node findMiddleNode(Node head)
	{
		Node slowPointer = head;
		Node fastPointer = head;
 
		while(fastPointer != null)
		{
			fastPointer = fastPointer.next; 

			if(fastPointer != null && fastPointer.next != null)
			{
				slowPointer = slowPointer.next; 
				fastPointer = fastPointer.next; 
			} 
		} 
 
		return slowPointer; 
	}

	public static Node reverseLinkedList(Node curr)
	{

		Node prev = null;
		Node next;

		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}

	// Function to check if linked list is palindrome or not
	public static boolean checkPalindrome (Node head)
	{
		Node middleNode = findMiddleNode(head);
		
		// head of right side
		Node secondHead = middleNode.next;
		
		// It is end of first part of linked list
		middleNode.next = null;
		
		// get reversed linked list for second part
		Node reverseSecondHead = reverseLinkedList(secondHead);
 
		// Verify each node's data. They all should be the same
		while(head!=null && reverseSecondHead!=null) {
			if(head.value == reverseSecondHead.value) {
				head=head.next;
				reverseSecondHead = reverseSecondHead.next;
				continue;
			}
			else {
				return false;
			}
		}
 
		return true;
 	}
 

 
 
	public static void main(String[] args) {
		LL_PalindromeCheck list = new LL_PalindromeCheck();
		Node head=new Node(1);
		list.addToTheLast(head);
		list.addToTheLast(new Node(2));
		list.addToTheLast(new Node(3));
		list.addToTheLast(new Node(2));
		list.addToTheLast(new Node(1));

 
		list.printList();
 
		System.out.println("Linked list palidrome: "+checkPalindrome(head));
	}
}