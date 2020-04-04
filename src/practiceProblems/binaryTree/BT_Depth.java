package practiceProblems.binaryTree;

public class BT_Depth {

    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }

    public static int getDepth(Node root)
    {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        int leftDepth = 1 + getDepth(root.left);
        int rightDepth = 1 + getDepth(root.right);

        return Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args)
    {
        Node rootNode=createBinaryTree();
        System.out.println(getDepth(rootNode));
    }

    public static Node createBinaryTree()
    {

        Node rootNode =new Node(40);
        Node node20=new Node(20);
        Node node10=new Node(10);
        Node node30=new Node(30);
        Node node60=new Node(60);
        Node node50=new Node(50);
        Node node70=new Node(70);
        Node node80=new Node(70);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        node30.right=node80;

        return rootNode;
    }
}
