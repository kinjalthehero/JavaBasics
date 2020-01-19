package practiceProblems.array;

public class Array_MyHashMap {

    final ListNode[] nodes = new ListNode[10000];

    class ListNode
    {
        int key, val;
        ListNode next;

        ListNode(int key, int val)
        {
            this.key = key;
            this.val = val;
        }
    }

    int idx(int key)
    {
        return Integer.hashCode(key) % nodes.length;
    }

    public void put(int key, int value)
    {
        int hashValue = idx(key);

        if (nodes[hashValue] == null)
            nodes[hashValue] = new ListNode(-1, -1);

        ListNode prev = find(nodes[hashValue], key);

        if (prev.next == null)
            prev.next = new ListNode(key, value);
        else
            prev.next.val = value;
    }

    ListNode find(ListNode bucket, int key)
    {
        ListNode node = bucket, prev = null;

        while (node != null && node.key != key)
        {
            prev = node;
            node = node.next;
        }

        return prev;
    }

    public int get(int key)
    {
        int i = idx(key);

        if (nodes[i] == null)
            return -1;

        ListNode node = find(nodes[i], key);

        return node.next == null ? -1 : node.next.val;
    }

    public void remove(int key)
    {
        int i = idx(key);

        if (nodes[i] == null)
            return;

        ListNode prev = find(nodes[i], key);

        if (prev.next == null)
            return;

        prev.next = prev.next.next;
    }
}
