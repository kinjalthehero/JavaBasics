package practiceProblems.linkedList;

public class LL_DeleteAllNodesWithVal {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val)
            head = head.next;

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            if (curr.val != val)
                prev = curr;
            else
                prev.next = curr.next;

            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args)
    {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(4);
        ListNode node31 = new ListNode(3);
        ListNode node32 = new ListNode(3);
        ListNode node33 = new ListNode(3);
        ListNode node34 = new ListNode(3);

        ListNode head = node1;
        node1.next = node31;
        node31.next = node2;
        node2.next = node32;
        node32.next = node4;
        node4.next = node33;
        node33.next = node5;
        node5.next = node34;

        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }

        ListNode newHead = deleteNodes(head, 3);
        System.out.println();

        curr = newHead;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    static ListNode deleteNodes (ListNode head, int element) {

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode curr = dummyNode.next;
        ListNode prev = dummyNode;

        while (curr != null) {

            if (curr.val == element) {
                curr = curr.next;
                prev.next = prev.next.next;
            } else {
                curr = curr.next;
                prev = prev.next;
            }
        }

        return dummyNode.next;
    }
}
