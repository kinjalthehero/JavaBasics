package practiceProblems.linkedList;

public class LL_IntersectionOfTwoLL{
	 
	private Node head;
 
	private static class Node 
	{	
		private int value;
		private Node next;
 
		Node(int value) {
			this.value = value;
		}
	}
 
	public void addToTheLast(Node node)
	{
		if (head == null) 
		{
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
	}
 
 
	public Node findIntersectionNode (Node head1, Node head2)
	{
		int lengthOfList1 = 0;
		int lengthOfList2 = 0;
		Node temp1 = head1;
		Node temp2 = head2;

		if (temp1 == null || temp2 == null)
			return null;
 
		// Find the length of both linked list
		while(temp1 != null)
		{
			lengthOfList1++;
			temp1 = temp1.next;
		}

		while(temp2 != null)
		{
			lengthOfList2++;
			temp2 = temp2.next;
		}
 
		int difference = 0;
		Node ptr1 = head1;
		Node ptr2 = head2;
 
		// Find difference in the list and iterate upto that point in the bigger list
		if(lengthOfList1 > lengthOfList2)
		{
			difference = lengthOfList1 - lengthOfList2;
			int i = 0;

			while(i < difference)
			{
				ptr1 = ptr1.next;
				i++;
			}
		}
		else
		{
			difference = lengthOfList2 - lengthOfList1;
			int i = 0;
			while(i < difference)
			{
				ptr2 = ptr2.next;
				i++;
			}
		}

		// Iterate over both linked list and find the common node
		while(ptr1 != null && ptr2 != null)
		{
			if(ptr1 == ptr2)
			{
				return ptr1;
			}
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
 
		return null;
	}

	public Node getIntersectionNode(Node headA, Node headB) {

		if(headA == null || headB == null)
			return null;

		Node curr1 = headA;
		Node curr2 = headB;

		//if a & b have different score_snakeLength, then we will stop the loop after second iteration
		while(curr1 != curr2)
		{
			//for the end of first iteration, we just reset the pointer to the dummyHead of another linkedlist
			curr1 = (curr1 == null) ? headB : curr1.next;
			curr2 = (curr2 == null)? headA : curr2.next;
		}

		return curr1;
	}


 
	public static void main(String[] args) 
	{
		LL_IntersectionOfTwoLL list1 = new LL_IntersectionOfTwoLL();
		// Creating a linked list
		Node head1=new Node(5);
		list1.addToTheLast(head1);
		list1.addToTheLast(new Node(6));
		Node node = new Node(7);
		list1.addToTheLast(node);
		list1.addToTheLast(new Node(1));
		list1.addToTheLast(new Node(2));
 
		LL_IntersectionOfTwoLL list2 = new LL_IntersectionOfTwoLL();
		Node head2=new Node(4);
		list2.addToTheLast(head2);
		list2.addToTheLast(node);
		list1.addToTheLast(new Node(1));
		list1.addToTheLast(new Node(2));

 
		Node findIntersectionNode = list1.findIntersectionNode(head1, head2);
		if(findIntersectionNode==null)
		{
			System.out.println("Two linked lists do not intersect!!");
		}
		else
		{
			System.out.println("Intersecting node: "+findIntersectionNode.value);
		}
	}
 
}
