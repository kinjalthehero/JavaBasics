package practiceProblems;

// https://java2blog.com/find-start-node-of-loop-in-linkedlist/

public class LL_StartOfTheLoop {
 
	private Node head;
	
	public Node  findStartNodeOfTheLoop() {
		
		Node fast = head;
		Node slow = head;
		boolean loopExists=false;
		
		while (fast != null && fast.next != null) {
			
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				loopExists = true;
				break;
			}
		}
		
		if(loopExists) {
			
			slow = head;
 
			while(slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}
		} else {
			System.out.println("Loop does not exists");
			slow=null;
		}
		return slow;
	}
 
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

	public static void main(String[] args) {
		LL_StartOfTheLoop list = new LL_StartOfTheLoop();
		// Creating a linked list
		Node loopNode=new Node(7);
		list.addToTheLast(new Node(5));
		list.addToTheLast(new Node(6));
		list.addToTheLast(loopNode);
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
 
		list.printList();
		list.addToTheLast(loopNode);  
 
		Node startNode=list.findStartNodeOfTheLoop();
		if(startNode!=null)
			System.out.println("start Node of loop is "+ startNode.value);
	}
}