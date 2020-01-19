package practiceProblems.binaryTree;

import java.util.*;

public class BT_SpiralOrder {

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

    public static void spiralOrZigzagLevelOrder(TreeNode root) {

        if(root==null)
            return;

        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);

        boolean directionflag = false;

        // NOTE: There are 2 same while loops
        while(!stack.isEmpty())
        {
            // Create temp stack of all elements in the next level in one direction
            Stack<TreeNode> tempStack=new Stack<>();

            // Pop and print all elements of the same level in one direction
            // NOTE: Second while loop
            while(!stack.isEmpty())
            {
                TreeNode tempNode = stack.pop();
                System.out.printf("%d ",tempNode.data);

                // directionFlag = false; push left first and then right
                // directionFlag = true; push right first and then left
                if(!directionflag)
                {
                    if(tempNode.left!=null)
                        tempStack.push(tempNode.left);
                    if(tempNode.right!=null)
                        tempStack.push(tempNode.right);
                } else
                {
                    if(tempNode.right!=null)
                        tempStack.push(tempNode.right);
                    if(tempNode.left!=null)
                        tempStack.push(tempNode.left);
                }
            }

            // NOTE: This part is outside of the 2nd while loop
            directionflag=!directionflag;

            // All elements of the next level is added, copy to the stack
            stack = tempStack;
        }
    }

    public static void spiralOrZigzagLevelOrder_usingQueue(TreeNode root) {

        if(root==null)
            return;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        boolean directionflag = false;

        // NOTE: There are 2 same while loops
        while(!queue.isEmpty())
        {
            // Create temp stack of all elements in the next level in one direction
            Queue<TreeNode> tempQueue=new LinkedList<>();

            // Pop and print all elements of the same level in one direction
            // NOTE: Second while loop
            while(!queue.isEmpty())
            {
                TreeNode tempNode = queue.poll();
                System.out.printf("%d ",tempNode.data);

                // directionFlag = false; push left first and then right
                // directionFlag = true; push right first and then left
                if(directionflag)
                {
                    if(tempNode.left!=null)
                        tempQueue.add(tempNode.left);
                    if(tempNode.right!=null)
                        tempQueue.add(tempNode.right);
                } else
                {
                    if(tempNode.right!=null)
                        tempQueue.add(tempNode.right);
                    if(tempNode.left!=null)
                        tempQueue.add(tempNode.left);
                }
            }

            // NOTE: This part is outside of the 2nd while loop
            directionflag=!directionflag;

            // All elements of the next level is added, copy to the stack
            queue = tempQueue;
        }
    }

    void directionTravel (TreeNode node)
    {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        boolean direction = false;

        while(!stack.isEmpty())
        {
            Stack<TreeNode> tempStack = new Stack<>();

            while (!stack.isEmpty()) {
                TreeNode tempNode = stack.pop();
                System.out.print(tempNode + " ");

                if (!direction)
                {
                    if (tempNode.left != null)
                        tempStack.push(tempNode.left);

                    if (tempNode.right != null)
                        tempStack.push(tempNode.right);
                }
                else
                {
                    if (tempNode.right != null)
                        tempStack.push(tempNode.right);

                    if (tempNode.left != null)
                        tempStack.push(tempNode.left);
                }
            }

            direction = !direction;

            stack = tempStack;

        }
    }

    public static void main(String[] args)
    {
        BT_SpiralOrder bi=new BT_SpiralOrder();
        // Creating a binary tree
        TreeNode rootNode=createBinaryTree();
        System.out.println("Spiral/Zigzag traversal of binary tree :");
        spiralOrZigzagLevelOrder(rootNode);
        System.out.println();
        spiralOrZigzagLevelOrder_usingQueue(rootNode);
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
        TreeNode node5=new TreeNode(5);
        TreeNode node55=new TreeNode(55);

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