package practiceProblems.queue;

public class Queue_UsingArray {

	private int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize = 0;

	public Queue_UsingArray(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		front = -1;
		rear = -1;
		queueArr = new int[this.capacity];
	}

	public void enqueue(int data) {

		if (isFull())
			System.out.println("Queue is full!! Can not add more elements");
		else {
			if (rear == -1)
				front = 0;

			rear = (rear+1) % queueArr.length;

			queueArr[rear] = data;
			currentSize++;
			System.out.println(data + " added to the queue");

		}
		System.out.println("Front: " + front + " rear: " + rear);
	}
	 
	 public void dequeue() {
		 if (isEmpty())
			 System.out.println("Queue is empty!! Can not dequeue element");
		 else {
		 	System.out.println("Removing " + queueArr[front]);
		 	queueArr[front] = 0;
		 	front = (front+1) % queueArr.length;
		 	currentSize--;
		 }
		 System.out.println("Front: " + front + " rear: " + rear);
	 }
	 
	 public boolean isFull(){
		 if (currentSize == capacity)
			 return true;

		 return false;
	 }
	 
	 public boolean isEmpty(){
	 
		 if (currentSize == 0)
			 return true;

		 return false;
	 }
	 
	 public static void main(String a[]){
	 
		 Queue_UsingArray queue = new Queue_UsingArray(5);
		 queue.enqueue(1);
		 queue.enqueue(2);
		 queue.enqueue(3);
		 queue.enqueue(4);
		 queue.enqueue(5);
		 queue.enqueue(6);
		 queue.dequeue();
		 queue.dequeue();
		 queue.enqueue(7);
		 queue.enqueue(8);
		 queue.enqueue(9);
		 queue.enqueue(10);
		 queue.dequeue();
		 queue.dequeue();
		 queue.dequeue();
		 queue.dequeue();
	 }
}