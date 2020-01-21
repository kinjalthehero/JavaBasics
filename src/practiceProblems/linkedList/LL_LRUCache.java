package practiceProblems.linkedList;

import java.util.HashMap;
import java.util.Map;

class LL_LRUCache {

    private class ListNode {
        int key;
        int value;

        ListNode prev;
        ListNode next;
    }

    // Hashtable backs up the Doubly Linked List for O(1) access to cache items
    Map<Integer, ListNode> hashmap = new HashMap<>();

    ListNode dummyHead;
    ListNode dummyTail;

    int totalItemsInCache;
    int maxCapacity;

    public LL_LRUCache(int maxCapacity) {

        // Cache starts empty and capacity is set by client
        totalItemsInCache = 0;
        this.maxCapacity = maxCapacity;

        // Dummy dummyHead and dummyTail nodes to avoid empty states
        dummyHead = new ListNode();
        dummyTail = new ListNode();

        // Wire the dummyHead and dummyTail together
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    public Integer get(int key) {

        ListNode node = hashmap.get(key);

        if (node == null) {
            return null;
        }

        removeFromList(node);
        addToFront(node);

        return node.value;
    }

    private void removeFromList (ListNode node) {

        ListNode savedPrev = node.prev;
        ListNode savedNext = node.next;

        savedPrev.next = savedNext;
        savedNext.prev = savedPrev;
    }

    private void addToFront(ListNode node) {

        node.prev = dummyHead;
        node.next = dummyHead.next;
        dummyHead.next.prev = node;
        dummyHead.next = node;
    }

    public void put(int key, int value) {

        ListNode node = hashmap.get(key);

        if (node == null) {

            // Item not found, create a new node
            ListNode newNode = new ListNode();
            newNode.key = key;
            newNode.value = value;

            // Add to the hash table and the actual list that represents the cache
            hashmap.put(key, newNode);
            addToFront(newNode);
            totalItemsInCache++;

            // If over capacity remove the LRU item
            if (totalItemsInCache > maxCapacity) {
                removeLRUEntry();
            }
        } else {
            // update the value and move it to the front
            node.value = value;
            removeFromList(node);
            addToFront(node);
        }
    }

    private void removeLRUEntry () {

        ListNode tail = popTail();

        hashmap.remove(tail.key);
        totalItemsInCache--;
    }

    private ListNode popTail () {

        ListNode tailItem = dummyTail.prev;
        removeFromList(tailItem);

        return tailItem;
    }

    public static void main(String[] args) {

        LL_LRUCache cache = new LL_LRUCache(5);
        cache.put(1,1);
        cache.put(2,3);
        cache.put(3,4);
        cache.put(4,7);
        cache.put(6,10);
        cache.get(1);
        cache.get(3);
        cache.put(1,5);
        cache.put(12,7);
        cache.put(5,2);
        cache.get(4);
    }
}
