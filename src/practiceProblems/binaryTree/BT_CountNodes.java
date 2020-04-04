package practiceProblems.binaryTree;

public class BT_CountNodes {

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int x)
        {
            val = x;
        }
    }

    public static int countNodes (Node node) {

        if (node == null)
            return 0;
        else
            return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        Node left2 = new Node(4);
        Node right2 = new Node(5);
        Node left3 = new Node(6);
        root.left = left;
        root.right = right;
        left.left = left2;
        left.right = right2;
        right.left = left3;

        System.out.println(countNodes(root));

        /*Node root2 = new Node(1);
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

        System.out.println(areSame(root4, root));*/
    }


}
