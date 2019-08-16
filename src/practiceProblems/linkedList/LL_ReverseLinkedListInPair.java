package practiceProblems.linkedList;

public class LL_ReverseLinkedListInPair{
	 
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
 
 
	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public static Node reverseLinkedListInPairs(Node head)
	{
		Node curr = head;
		Node temp = null;
		Node newHead = null;

		while (curr != null && curr.next != null)
		{
			if (temp != null)
			{
				// This is important step
				temp.next.next = curr.next;
			}

			temp=curr.next;
			curr.next=temp.next;
			temp.next=curr;
 
			if (newHead == null)
				newHead = temp;

			curr=curr.next;
 
		}     
		return newHead;
	}
 
	public static void main(String[] args) {
		LL_ReverseLinkedListInPair list = new LL_ReverseLinkedListInPair();
		
		Node head=new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
		list.addToTheLast(new Node(8));
 
		list.printList(head);
		
		Node result=reverseLinkedListInPairs(head);
		
		System.out.println("After reversing in pair");
		list.printList(result);
	}
}