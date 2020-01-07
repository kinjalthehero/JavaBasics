package practiceProblems.binaryTree;

public class BT_BoundryTraversal {

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

    public static void boundaryLevelTraversal(Node root)
    {
        System.out.print(root.data+" ");
        printLeftEdgeNodes(root.left);
        printLeafNodes(root);
        printRightBottomUp(root.right);

    }

    private static void printLeafNodes(Node root)
    {
        if(root==null)
            return;

        if(root.left==null && root.right==null)
        {
            System.out.print(root.data+" ");
            return;
        }
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }

    private static void printRightBottomUp(Node root)
    {
        if(root==null)
            return;

        // if leaf node, ignore
        if(root.left==null && root.right==null)
            return;

        // NOTE: else if is important instead of just else
        if(root.right != null)
            printRightBottomUp(root.right);
        else
            printRightBottomUp(root.left);

        System.out.print(root.data+" ");
    }


    private static void printLeftEdgeNodes(Node root)
    {

        if(root==null)
            return;

        // if leaf node, ignore
        if(root.left == null && root.right == null)
            return;

        System.out.print(root.data + " ");

        // If left is null, right will be the boundary edge. Check 5 -> 45 in the diagram
        if(root.left != null)
            printLeftEdgeNodes(root.left);
        else
            printLeftEdgeNodes(root.right);
    }

    public static void main(String[] args)
    {
        // Creating a binary tree
        Node rootNode=createBinaryTree();
        System.out.println("Boundary traversal of binary tree will be:");
        boundaryLevelTraversal(rootNode);
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
        Node node5=new Node(5);
        Node node45=new Node(45);
        Node node55=new Node(55);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        node10.right=node5;
        node5.right=node45;

        node50.right=node55;
        return rootNode;
    }
}