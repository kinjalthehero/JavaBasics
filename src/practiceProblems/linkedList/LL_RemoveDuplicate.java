package practiceProblems.linkedList;

public class LL_RemoveDuplicate {

    class ListNode {

        int val;
        ListNode next;
    }

    public ListNode deleteDuplicates(ListNode head) {

        // base condition
        if( head == null || head.next == null)
            return head;

        // no duplicate
        if (head.val != head.next.val) {
            head.next = deleteDuplicates(head.next);

            // returning head because we want original head in the output
            return head;
        } else {
            while(head.next != null && head.val == head.next.val) {
                head = head.next;
            }

            // we return result of the method because we don't want original head in the output
            return deleteDuplicates(head.next);
        }
    }
}
