package practiceProblems.binarySearch;

public class BinarySearch_ClosestValueInBST {

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

    public static int findClosestValue (Node node, double target) {

        Node closest = node;

        while (node != null) {
            closest = (node.data < closest.data) ? node : closest;
            node = node.data < target ? node.left : node.right;
        }

        return closest.data;
    }



    public static void main(String[] args) {

        // Creating a binary search tree
        Node rootNode=createBinarySearchTree();


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

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        node10.left=node5;
        node50.right=node55;
        return rootNode;
    }



}
