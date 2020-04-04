package practiceProblems.linkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class LFUCache {

    Map<Integer, Node> nodeMap;
    Map<Integer, DLL> freqMap = new HashMap<>();
    int capacity, currSize, minFreq;

    LFUCache() {
        this.capacity = capacity;
        currSize = 0;
        nodeMap = new HashMap<>();
        freqMap = new HashMap<>();
    }


    class Node {

        int key, value, freq;
        Node next, prev;

    }

    class DLL {

        int freq;
        Node dummyHead = new Node();
        Node dummyTail = new Node();

        DLL(int freq) {
            dummyHead.next = dummyTail;
            dummyTail.prev = dummyHead;
            this.freq = freq;
        }

        void deleteNode (Node node) {

            Node prevSaved = node.prev;
            Node nextSaved = node.next;

            nextSaved.prev = prevSaved;
            prevSaved.next = nextSaved;
        }

        boolean isEmpty() {
            return dummyHead.next == dummyTail;
        }

        void addNodeToFront (Node node) {

            node.prev = dummyHead;
            node.next = dummyHead.next;
            dummyHead.next.prev = node;
            dummyHead.next = node;
        }

        Node deleteLastNode() {

            Node lastNode = dummyTail.prev;
            deleteNode(lastNode);

            nodeMap.remove(lastNode);

            return lastNode;
        }
    }

    int get(int key) {

        Node tempNode = nodeMap.get(key);

        // if not present
        if (tempNode == null)
            return -1;

        // if present
        int tempFreq = tempNode.freq;

        // remove from the linked list
        freqMap.get(tempFreq).deleteNode(tempNode);

        if (tempNode.freq == minFreq && freqMap.get(minFreq).isEmpty())
            minFreq++;

        // increase freq of the node
        tempNode.freq++;

        // add to the increased freq LList
        freqMap.computeIfAbsent(tempNode.freq, k -> new DLL(tempNode.freq)).addNodeToFront(tempNode);

        return tempNode.value;
    }

    void put(int key, int value) {

        Node tempNode = nodeMap.get(key);

        // if present
        if (tempNode != null) {
            // update node value
            tempNode.value = value;

            // remove from old freq map
            freqMap.get(tempNode.freq).deleteNode(tempNode);

            if (tempNode.freq == minFreq && freqMap.get(minFreq).isEmpty())
                minFreq++;

            // increase freq
            tempNode.freq++;

            // add to the new freq
            freqMap.computeIfAbsent(tempNode.freq, k -> new DLL(tempNode.freq)).addNodeToFront(tempNode);
        } else {

            // create node
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            newNode.freq = 1;

            // add to the node map
            nodeMap.put(key, newNode);

            if (currSize == capacity) {
                Node deletedNode = freqMap.get(minFreq).deleteLastNode();
                nodeMap.remove(deletedNode.key);
                currSize--;
            }

            // add to freq 1 list
            freqMap.computeIfAbsent(1, k -> new DLL(1)).addNodeToFront(newNode);
            currSize++;
            minFreq = 1;
        }
    }
}