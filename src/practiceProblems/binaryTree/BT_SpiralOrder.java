package practiceProblems.binaryTree;

import java.util.Stack;

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

    // Concept is difficult to understand
    public static void spiralOrZigzagLevelOrder(TreeNode root) {

        if(root==null)
            return;

        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);

        boolean directionflag = false;

        while(!stack.isEmpty())
        {
            // Create stack of all elements in the next level
            Stack<TreeNode> tempStack=new Stack<>();

            // Pop and print all elements of the same level
            while(!stack.isEmpty())
            {
                TreeNode tempNode = stack.pop();
                System.out.printf("%d ",tempNode.data);

                // For the first time, push left element first and then right element
                // reverse direction in the next level
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
            // for changing direction
            directionflag=!directionflag;

            // All elements of the next level is added, copy to the stack
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