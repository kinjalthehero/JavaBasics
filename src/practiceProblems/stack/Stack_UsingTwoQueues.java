package practiceProblems.stack;

import java.util.LinkedList;
import java.util.Queue;

/* 
	Push : 
	If queue1 is empty, add elements to queue1
	If queue1 is not empty, add all elements of queue1 to queue2 , add current element to queue1 and copy all elements of queue2 to queue1.
	Pop : 
	Simply remove element from queue1.
*/

public class Stack_UsingTwoQueues {
 
	Queue<Integer> queue1;
	Queue<Integer> queue2;
	
	Stack_UsingTwoQueues()
	{
		queue1=new LinkedList<Integer>();
		queue2=new LinkedList<Integer>();
	}
 
 
	// Remove value from the beginning of the list 
	public void push(int i){
		
		if(queue1.size()==0)
		{
			queue1.add(i);
		}
		else
		{
			int sizeOfQueue1 = queue1.size();
			// Copy elements of Queue1 to Queue2
			for(int j=0 ; j<sizeOfQueue1 ; j++)
				queue2.add(queue1.remove());
			queue1.add(i);
			// Copy elements for Queue2 to Queue1
			for(int k=0 ; k<sizeOfQueue1 ; k++)
				queue1.add(queue2.remove());
		}
	}
 
	public int pop(){
		if(queue1.size()==0)
		{
			throw new QueueEmptyException("Underflow Exception");
		}
		return queue1.remove();
	}
 
	public static void main(String[] args) {
		Stack_UsingTwoQueues stack = new Stack_UsingTwoQueues();
		stack.push(20);
		stack.push(40);
		stack.push(70);
		stack.push(50);
		stack.push(90);
		stack.push(110);
		stack.push(30);
		System.out.println("Removed element : "+ stack.pop());
		stack.push(170);
		System.out.println("Removed element : "+ stack.pop());
	}
}
/**
 * Exception to indicate that Queue is empty.
 */
 
class QueueEmptyException extends RuntimeException {
	private static final long serialVersionUID = 1L;
 
	public QueueEmptyException() {
		super();
	}
 
	public QueueEmptyException(String message) {
		super(message);
	}
}