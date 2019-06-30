package practiceProblems.linkedList;

public class LL_FindCycleOrLoop {
    
	private Node head;
	
    public boolean isCyclic() {
        
    	Node fast = head;
        Node slow = head;
       
        /* 
    	 * Move fast twice and slow once
    	 * If null doesn't have cycle then fast will end in one of the below condition
    	 * If there is a cycle then eventually fast and slow will meet
    	 * If number of nodes are even then fast stop when fast reaches null
         * If number of nodes are odd then stop when next of fast is null 
    	 */
        while(fast != null && fast.next != null){
       
        	fast = fast.next.next;
            slow = slow.next;
           
            //if fast and slow pointers are meeting then LinkedList is cyclic
            if(fast == slow ){
                return true;
            }
        }
        return false;
    }
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node current = head.next();
        while(current != null){
           sb.append(current).append("-->");
           current = current.next();
        }
        sb.delete(sb.length() - 3, sb.length()); // to remove --> from last node
       return sb.toString();
    }

    public static class Node {
        private Node next;
        private String data;

        public Node(String data) {
            this.data = data;
        }

        public String data() { return data; }
        public void setData(String data) { this.data = data;}

        public Node next() { return next; }
        public void setNext(Node next) { this.next = next; }

        @Override
        public String toString() {
            return this.data;
        }
    }
}