package practiceProblems.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BT_FindLargestNode
{
    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data=data;
        }
    }

    // Recursive Solution
    public static  int getMaximumRec(TreeNode root)
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
    public static int getMaximumItr(TreeNode startNode)
    {
        int max = Integer.MIN_VALUE;

        // Make a queue using linked list
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(startNode);

        while(!queue.isEmpty())
        {
            // Retrieves and removes the head of this queue, or returns null if this queue is empty.
            TreeNode tempNode = queue.poll();

            if(max < tempNode.data)
                max = tempNode.data;

            if(tempNode.left != null)
                queue.add(tempNode.left);

            if(tempNode.right != null)
                queue.add(tempNode.right);
        }

        return max;
    }


    public static void main(String[] args)
    {
        // Creating a binary tree
        TreeNode rootNode=createBinaryTree();
        System.out.println("Max node using recursion :"+getMaximumRec(rootNode));
        System.out.println("Max node using iteration :"+getMaximumItr(rootNode));
    }

    public static TreeNode createBinaryTree()
    {

        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        return rootNode;
    }
}
