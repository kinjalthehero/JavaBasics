package practiceProblems.linkedList;

class LL_Leet_MergeLinkedList {

    private ListNode head;

    private static class ListNode
    {
        private int val;
        private ListNode next;

        ListNode(int value) {
            this.val = value;
        }
    }

    public void addToTheLast(ListNode node)
    {
        if (head == null)
        {
            head = node;
        } else {
            ListNode temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;

        while (l1 != null && l2 != null)
        {
            if (l1.val <= l2.val)
            {
                prev.next = l1;
                l1 = l1.next;
            }
            else
            {
                prev.next = l2;
                l2 = l2.next;
            }

            prev = prev.next;
        }

        if (l1 != null)
            prev.next = l1;
        else
            prev.next = l2;

        return prehead.next;
    }

    public static void print(ListNode node) {
        //Node node = head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        LL_Leet_MergeLinkedList list1 = new LL_Leet_MergeLinkedList();
        // Creating a linked list
        ListNode head1=new ListNode(1);
        list1.addToTheLast(head1);
        list1.addToTheLast(new ListNode(2));
        ListNode node = new ListNode(4);
        list1.addToTheLast(node);

        LL_Leet_MergeLinkedList list2 = new LL_Leet_MergeLinkedList();
        ListNode head2=new ListNode(1);
        list2.addToTheLast(head2);
        list2.addToTheLast(new ListNode(3));
        list2.addToTheLast(new ListNode(4));

        ListNode findIntersectionNode = mergeTwoLists(head1, head2);
        print(findIntersectionNode);


    }
}