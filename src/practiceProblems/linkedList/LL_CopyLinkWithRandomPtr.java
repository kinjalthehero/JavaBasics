package practiceProblems.linkedList;

import java.util.HashMap;
import java.util.Map;

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class LL_CopyLinkWithRandomPtr {

    private static class Node {

        int val;
        Node next;
        Node random;

        Node (int val) {

            this.val = val;
        }
    }

    public Node copyRandomList(Node head) {

        if(head == null)
            return head;

        Map<Node, Node> map = new HashMap<>();
        Node curr = head;

        // curr -> newNode
        while (curr != null) {
            Node newNode = new Node(curr.val);
            map.put(curr, newNode);
            curr = curr.next;
        }

        curr = head;
        Node outputCurr = map.get(head);

        while (curr != null) {
            Node nextNode = map.get(curr.next);
            Node randNode = map.get(curr.random);
            outputCurr.next = nextNode;
            outputCurr.random = randNode;
            curr = curr.next;
            outputCurr = outputCurr.next;
        }

        return map.get(head);
    }
}