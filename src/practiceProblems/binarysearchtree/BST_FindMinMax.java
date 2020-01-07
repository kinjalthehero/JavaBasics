package practiceProblems.binarysearchtree;

public class BST_FindMinMax
{
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

    // Get minimum element in binary search tree
    public static Node minimumElement(Node root)
    {
        Node minElement = null;

        if(root.left == null)
            return root;
        else
            minElement = minimumElement(root.left);

        return minElement;
    }

    // Get maximum element in binary search tree
    public static Node maximumElement(Node root)
    {
        if(root.right == null)
            return root;
        else
            return maximumElement(root.right);
    }

    public static Node insert(Node root, Node nodeToBeInserted)
    {
        if(root==null)
        {
            root=nodeToBeInserted;
            return root;
        }

        if(root.data > nodeToBeInserted.data)
        {
            if(root.left==null)
                root.left=nodeToBeInserted;
            else
                insert(root.left,nodeToBeInserted);
        }
        else if(root.data < nodeToBeInserted.data)
            if(root.right==null)
                root.right=nodeToBeInserted;
            else
                insert(root.right,nodeToBeInserted);
        return root;
    }

    public static void main(String[] args)
    {
        Node rootNode=createBinarySearchTree();
        System.out.println("Minimum element in binary search tree: "+minimumElement(rootNode).data);
        System.out.println("Maximum element in binary search tree: "+maximumElement(rootNode).data);
        System.out.println(search(rootNode, 40));
        System.out.println(search(rootNode, 20));
        System.out.println(search(rootNode, 10));
        System.out.println(search(rootNode, 30));
        System.out.println(search(rootNode, 60));
        System.out.println(search(rootNode, 50));
        System.out.println(search(rootNode, 70));
        System.out.println(search(rootNode, 5));
        System.out.println(search(rootNode, 55));
        System.out.println(search(rootNode, 100));
    }

    static boolean search (Node node, int element) {

        while (node != null) {

            if (node.data == element)
                return true;
            else if (node.data > element)
                node = node.left;
            else
                node = node.right;
        }

        return false;
    }


    public static Node createBinarySearchTree()
    {
        Node rootNode =new Node(40);
        Node node20=new Node(20);
        Node node10=new Node(10);
        Node node30=new Node(30);
        Node node60=new Node(60);
        Node node50=new Node(50);
        Node node70=new Node(70);
        Node node5=new Node(5);
        Node node55=new Node(55);

        insert(null,rootNode);
        insert(rootNode,node20);
        insert(rootNode,node10);
        insert(rootNode,node30);
        insert(rootNode,node60);
        insert(rootNode,node50);
        insert(rootNode,node70);
        insert(rootNode,node5);
        insert(rootNode,node55);

        return rootNode;
    }
}
