package practiceProblems.linkedList;


public class LL_QueueUsingLL {
	
	private Node front, rear; 
	private int length;

	private class Node
	{
		int data;
		Node next;
	}

	public LL_QueueUsingLL() {
		
		front = null;
		rear = null;
		length = 0;
	}
	 
	public boolean isEmpty() {
		
		return (length == 0);
	}

	// Add data to the end of the list
	public void enqueue(int data)
	{
		Node oldRear = rear;
		rear = new Node();
		rear.data = data;
		rear.next = null;

		if (isEmpty())
			front = rear;
		else
			oldRear.next = rear;

		length++;
		System.out.println(data+ " added to the queue");
	}
 
	// Remove item from the beginning of the list
	public int dequeue()
	{
		int data = front.data;
		front = front.next;
		
		if (isEmpty()) 
			rear = null;
	 
		length--;
		System.out.println(data+ " removed from the queue");
		
		return data;
	}

	 public static void main(String a[]){
	 
		 LL_QueueUsingLL queue = new LL_QueueUsingLL();
		 queue.enqueue(6);
		 queue.dequeue();
		 queue.enqueue(3);
		 queue.enqueue(99);
		 queue.enqueue(56);
		 queue.dequeue();
		 queue.enqueue(43);
		 queue.dequeue();
		 queue.enqueue(89);
		 queue.enqueue(77);
		 queue.dequeue();
		 queue.enqueue(32);
		 queue.enqueue(232);
	 }
}