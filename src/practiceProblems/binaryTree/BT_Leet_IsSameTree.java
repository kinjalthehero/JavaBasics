package practiceProblems.binaryTree;

public class BT_Leet_IsSameTree {

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int x)
        {
            val = x;
        }
    }

    public boolean isSameTree(Node p, Node q) {
        if(p == null && q == null)
            return true;

        if(p == null || q == null)
            return false;

        if(p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        return false;
    }

    static boolean areSame (Node node1, Node node2) {

        if (node1 == null && node2 == null)
            return true;

        if (node1 == null || node2 == null)
            return false;

        if (node1.val != node2.val)
            return false;

        return areSame(node1.left, node2.left) && areSame(node1.left, node2.left);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        root.left = left;
        root.right = right;

        System.out.println(areSame(root, root));

        Node root2 = new Node(1);
        Node left2 = new Node(2);
        root2.left = left2;

        Node root3 = new Node(1);
        Node right3 = new Node(3);
        root3.right = right3;

        System.out.println(areSame(root2, root3));

        Node root4 = new Node(1);
        Node left4 = new Node(3);
        Node right4 = new Node(2);
        root4.left = left4;
        root4.right = right4;

        System.out.println(areSame(root4, root));
    }
}
