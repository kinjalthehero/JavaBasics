package practiceProblems.binaryTree;

public class BT_CountLeafNodes {

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

    // Recursive Solution
    /* To get the count of leaf nodes in a binary tree*/
    public static  int getLeafCountOfBinaryTree(Node node)
    {
        if(node == null)
            return 0;
        if(node.left ==null && node.right==null)
            return 1;
        else
            return getLeafCountOfBinaryTree(node.left)+ getLeafCountOfBinaryTree(node.right);
    }

    public static void main(String[] args)
    {
        // Creating a binary tree
        Node rootNode=createBinaryTree();
        System.out.println("Number of leaf nodes in binary tree :"+getLeafCountOfBinaryTree(rootNode));
        System.out.println("Number of leaf nodes in binary tree :"+leafNodes(rootNode));
    }

    static int leafNodes (Node root) {

        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        int left = leafNodes(root.left);
        int right = leafNodes(root.right);

        return left + right;
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

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        return rootNode;
    }
}
