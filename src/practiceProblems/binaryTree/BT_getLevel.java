package practiceProblems.binaryTree;

public class BT_getLevel {

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

    public static int getLevelOfNode(Node root, int key, int level)
    {
        if(root == null)
            return 0;

        if(root.data == key)
            return level;

        int result = getLevelOfNode(root.left, key,level+1) ;

        if(result != 0)
        {
            // If found in left subtree , return
            return result;
        }

        result= getLevelOfNode(root.right, key,level+1);

        return result;
    }

    public static void main(String[] args)
    {
        // Creating a binary tree
        Node rootNode=createBinaryTree();
        System.out.println("Node data: 70,Level :"+getLevelOfNode(rootNode, 70, 1));
        System.out.println("Node data: 100,Level :"+getLevelOfNode(rootNode, 100, 1));
        System.out.println("Node data: 60,Level :"+getLevelOfNode(rootNode, 60, 1));
        System.out.println("Node data: 40,Level :"+getLevelOfNode(rootNode, 40, 1));

        System.out.println("Node data: 70,Level :"+level(rootNode, 70));
        System.out.println("Node data: 100,Level :"+level(rootNode, 100));
        System.out.println("Node data: 60,Level :"+level(rootNode, 60));
        System.out.println("Node data: 40,Level :"+level(rootNode, 40));
    }

    static int level (Node node, int element) {

        if (node == null)
            return 0;

        if (node.data == element)
            return 1;

        int leftLevel = 1 + level (node.left, element);
        int rightLevel = 1 + level (node.right, element);

        return (leftLevel > rightLevel) ? leftLevel : rightLevel;
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
