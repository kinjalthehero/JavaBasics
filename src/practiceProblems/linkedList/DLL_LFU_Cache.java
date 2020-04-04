package practiceProblems.linkedList;

import java.util.HashMap;

public class DLL_LFU_Cache {

    // LList node
    class Node {

        int key,value,freq;
        Node prev,next;

        Node(int key,int value) {
            this.key = key;
            this.value = value;
            this.freq = 0;
        }
    }

    // For each freq, then is a separate Linkedlist
    // Frequency -> Linked List
    // Recently used will be placed in the front
    class DLinkedList {

        int freq;
        Node dummyHead, dummyTail;

        DLinkedList(int freq) {
            this.freq =  freq;
            dummyHead = new Node(0,0);
            dummyTail = new Node(0,0);
            dummyHead.next = dummyTail;
            dummyTail.prev = dummyHead;
        }

        // Add to the front of the list because it is recently used
        void add (Node node) {
            Node temp = dummyHead.next;
            dummyHead.next = node;
            node.prev = dummyHead;
            node.next = temp;
            temp.prev = node;
        }

        boolean isEmpty(){
            return dummyHead.next == dummyTail;
        }

        void delete (Node node){
            node.next.prev = node.prev;
            node.prev.next = node.next;
        }

        // Remove from the end which is Least recently used
        Node pop(){
            if (isEmpty())
                return null;

            Node node = dummyTail.prev;
            delete(node);

            return node;
        }
    }

    int cacheCapacity, currCacheSize, minFreq;

    // maps key to its node
    HashMap<Integer,Node> nodeMap;

    // maps freq with linkedlist
    HashMap<Integer,DLinkedList> freqMap;

    public DLL_LFU_Cache(int cacheCapacity) {

        this.cacheCapacity = cacheCapacity;
        this.currCacheSize = minFreq = 0;
        nodeMap = new HashMap<>();
        freqMap = new HashMap<>();

        // initialize
        freqMap.put(0, new DLinkedList(0));
    }

    public int get(int key) {

        if(!nodeMap.containsKey(key))
            return -1;

        Node node = nodeMap.get(key);
        return updateNode(node);
    }

    public void put(int key, int value) {

        if(cacheCapacity == 0)
            return;

        // update node map and freq map if present
        if (nodeMap.containsKey(key)) {

            // update node value from the node map
            Node node = nodeMap.get(key);
            node.value = value;

            // update position in freqMap
            updateNode(node);

            // return because we are not adding any value so no need to check capacity
            return;
        }

        // if not present: remove LFU node from the cache and then add the node
        if(currCacheSize >= cacheCapacity) {
            Node old = freqMap.get(minFreq).pop();
            nodeMap.remove(old.key);
            currCacheSize--;
        }

        Node node = new Node(key,value);
        freqMap.get(0).add(node);
        nodeMap.put(key,node);
        minFreq = 0;
        currCacheSize++;
    }

    // remove node from current freq
    // add at the front of new freq
    private int updateNode (Node node) {

        // get the node freq
        int freq = node.freq;

        // remove the node from freqmap
        freqMap.get(freq).delete(node);

        // if node had min freq then also check if freqMap for that min freq is empty
        // if it is empty then increment min freq
        if (node.freq == minFreq && freqMap.get(minFreq).isEmpty())
            minFreq++;

        // increase the freq
        node.freq++;

        // add the node in freqmap with the new freq
        freqMap.computeIfAbsent(node.freq, k->new DLinkedList(node.freq)).add(node);

        return node.value;
    }
}