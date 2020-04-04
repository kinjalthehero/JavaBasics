package practiceProblems.linkedList;

public class LL_RemoveDuplicateKeepUniqueNodes {

    class ListNode {

        int val;
        ListNode next;
    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null)
            return head;

        head.next = deleteDuplicates(head.next);

        return head.val == head.next.val ? head.next : head;
    }
}
