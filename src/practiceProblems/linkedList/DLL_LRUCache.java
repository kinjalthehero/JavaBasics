package practiceProblems.linkedList;

import java.util.HashMap;

class LinkedList_Node
{
    int key;
    int value;
    LinkedList_Node prev;
    LinkedList_Node next;
 
    public LinkedList_Node(int key, int value)
    {
        this.key=key;
        this.value=value;
    }
}

class DLL_ListNodeCache
{
    
	LinkedList_Node head;
    LinkedList_Node tail;
    HashMap<Integer, LinkedList_Node> map = null;
    int cap = 0;
 
    public DLL_ListNodeCache(int capacity)
    {
        this.cap = capacity;
        this.map = new HashMap<>();
    }
 
    public int get(int key)
    {
        if(map.get(key) == null)
            return -1;

        //move to dummyTail
        LinkedList_Node t = map.get(key);
 
        removeNode(t);
        offerNode(t);
 
        return t.value;
    }
 
    public void put(int key, int value) {
        if(map.containsKey(key)){
            LinkedList_Node t = map.get(key);
            t.value = value;
 
            //move to dummyTail
            removeNode(t);
            offerNode(t);
        }
        else
        {
            if(map.size()>=cap)
            {
                //delete dummyHead
                map.remove(head.key);
                removeNode(head);
            }
 
            //add to dummyTail
            LinkedList_Node node = new LinkedList_Node(key, value);
            offerNode(node);
            map.put(key, node);
        }
    }
 
    private void removeNode(LinkedList_Node n)
    {
        if(n.prev!=null)
        {
            n.prev.next = n.next;
        }else
        {
            head = n.next;
        }
 
        if(n.next!=null)
        {
            n.next.prev = n.prev;
        }
        else
        {
            tail = n.prev;
        }
    }
 
    private void offerNode(LinkedList_Node n)
    {
        if(tail!=null)
        {
            tail.next = n;
        }
 
        n.prev = tail;
        n.next = null;
        tail = n;
 
        if(head == null)
        {
            head = tail;   
        }
    }
}