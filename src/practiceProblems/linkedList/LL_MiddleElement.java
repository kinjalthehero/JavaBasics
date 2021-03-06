package practiceProblems.linkedList;

/**
 * Java program to find middle element of linked list in one pass.
 * In order to find middle element of a linked list 
 * we need to find the length first but since we can only 
 * traverse linked list one time, we will have to use two pointers
 * one which we will increment on each iteration while 
 * other which will be incremented every second iteration.
 * So when the first pointer will point to the end of a 
 * linked list, second will be pointing to the middle 
 * element of a linked list
 */
public class LL_MiddleElement {
  
    public static void main(String args[]) {
      
      //creating LL_BasicOperations with 5 elements including dummyHead
      LList lList = new LList();
      LList.Node head = lList.head();
      lList.add( new LList.Node("1"));
      lList.add( new LList.Node("2"));
      lList.add( new LList.Node("3"));
      lList.add( new LList.Node("4"));

        findMiddleNode(head);

      lList.add(new LList.Node("5"));

        findMiddleNode(head);
    }

    static void middleNode (LList.Node head) {

        if (head == null || head.next() == null)
            return;

        LList.Node slow = head, fast = head;

        while (fast != null && fast.next() != null) {

            slow = slow.next();
            fast = fast.next().next();
        }

        System.out.println(slow.data());

    }

    static public void findMiddleNode(LList.Node head)
    {
        LList.Node slow = head;
        LList.Node fast = head;

        while(fast != null)
        {
            fast = fast.next();

            if(fast != null && fast.next() != null) {
                slow = slow.next();
                fast = fast.next();
            }
        }

        System.out.println(slow.next());
    }

    private static void getMiddleElement(LList.Node head) {
 		
    	//finding middle element of LL_BasicOperations in single pass
    	int length = 0;
    	LList.Node current = head;
    	LList.Node middle = head;

    	// Loop till the last element
    	// Logic: We increment middle only when length has increased by 2
    	while(current.next() != null) {
	      
    		length++;
	      
    		if(length % 2 == 0)
    			middle = middle.next();
	      
    		current = current.next();
    	}

    		  // Odd number of elements
    	if(length % 2 == 1)
    	  middle = middle.next();

    	System.out.println("length of LL_BasicOperations: " + length);
    	System.out.println("middle element of LL_BasicOperations : "                                  + middle);
    } 
  
}

class LList {
    
	private Node head;
    private Node tail;
  
    public LList(){
        this.head = new Node("dummyHead");
        tail = head;
    }
  
    public Node head(){
        return head;
    }
  
    public void add(Node node){
        tail.next = node;
        tail = node;
    }
  
    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }
      
        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
      
        public String toString(){
            return this.data;
        }
    }
}

/* 
Output:
length of LL_BasicOperations: 4
middle element of LL_BasicOperations: 2
*/
