package practiceProblems.linkedList;

import java.util.HashMap;
import java.util.Map;

public class DLL_Leet_LRUCache {

    private Map<Integer, DLinkedNode> cache = new HashMap<>();
    private int size;
    private int capacity;
    private DLinkedNode head, tail;

    class DLinkedNode
    {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
    }

    public DLL_Leet_LRUCache(int capacity)
    {
        this.size = 0;
        this.capacity = capacity;

        head = new DLinkedNode();
        // head.prev = null;

        tail = new DLinkedNode();
        // tail.next = null;

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key)
    {
        DLinkedNode node = cache.get(key);

        if (node == null)
            return -1;

        // move the accessed node to the head;
        moveToHead(node);

        return node.value;
    }

    public void put(int key, int value)
    {
        DLinkedNode node = cache.get(key);

        // Node doesn't exist in cache
        if(node == null)
        {
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;

            cache.put(key, newNode);
            addNode(newNode);

            size++;

            if(size > capacity)
            {
                // pop the tail
                DLinkedNode tail = popTail();
                cache.remove(tail.key);
                size--;
            }
        }
        else {
            node.value = value;
            moveToHead(node);
        }
    }

    //Always add the new node right after head.
    private void addNode(DLinkedNode node) {

        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    //Remove an existing node from the linked list.
    private void removeNode(DLinkedNode node)
    {
        DLinkedNode prev = node.prev;
        DLinkedNode next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    private void moveToHead(DLinkedNode node){

        //Move certain node in between to the head.
        removeNode(node);
        addNode(node);
    }

    private DLinkedNode popTail() {

        //Pop the current tail.
        DLinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }
}
