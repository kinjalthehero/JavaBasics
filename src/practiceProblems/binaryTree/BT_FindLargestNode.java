package practiceProblems.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BT_FindLargestNode
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

    // Recursive Solution
    public static  int getMaximumRec(Node root)
    {
        int max = Integer.MIN_VALUE;
        int currValue = 0;
        int left, right;

        if(root != null)
        {
            currValue = root.data;

            left = getMaximumRec(root.left);
            right = getMaximumRec(root.right);

            if(left > right)
                max = left;
            else
                max = right;

            if(currValue > max)
                max = currValue;
        }

        return max;
    }



    // Iterative Solution
    public static int getMaximumItr(Node startNode)
    {
        int max = Integer.MIN_VALUE;

        // Make a queue using linked list
        Queue<Node> queue = new LinkedList<>();
        queue.add(startNode);

        while(!queue.isEmpty())
        {
            // Retrieves and removes the head of this queue, or returns null if this queue is empty.
            Node tempNode = queue.poll();

            if(max < tempNode.data)
                max = tempNode.data;

            if(tempNode.left != null)
                queue.add(tempNode.left);

            if(tempNode.right != null)
                queue.add(tempNode.right);
        }

        return max;
    }

    public static boolean search (Node root, Node searchNode) {

        Node curr = root;

        while (curr != null && curr.data != searchNode.data) {
            if (searchNode.data < curr.data)
                curr = curr.left;
            else
                curr = curr.right;
        }

        boolean result = (curr == null)? false: true;
        return result;
    }


    public static void main(String[] args)
    {
        // Creating a binary tree
        Node rootNode=createBinaryTree();
        //System.out.println("Max node using recursion :"+getMaximumRec(rootNode));
        //System.out.println("Max node using iteration :"+getMaximumItr(rootNode));
        System.out.println(search(rootNode, rootNode));
        System.out.println(search(rootNode, rootNode.left));
        System.out.println(search(rootNode, rootNode.right));
        System.out.println(search(rootNode, rootNode.left.left));
        System.out.println(search(rootNode, rootNode.left.right));
        System.out.println(search(rootNode, rootNode.right.left));
        System.out.println(search(rootNode, rootNode.right.right));

        Node newNode =new Node(100);
        System.out.println(search(rootNode, newNode));

        System.out.println(largest(rootNode));
    }

    static int largestNumber = Integer.MIN_VALUE;

    static int largest (Node node) {

        if(node == null)
            return largestNumber;

        if (node.data > largestNumber)
            largestNumber = node.data;

        int leftLargest = largest(node.left);
        int rightLargest = largest(node.right);

        if (leftLargest > largestNumber)
            return leftLargest;
        else if (rightLargest > largestNumber)
            return rightLargest;
        else
            return largestNumber;
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
