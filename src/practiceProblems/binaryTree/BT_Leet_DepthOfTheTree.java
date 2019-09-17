package practiceProblems.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BT_Leet_DepthOfTheTree {

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

    static int maxDepth_recursion(TreeNode root)
    {

        if(root == null)
            return 0;

        int depth_left = maxDepth_recursion(root.left) + 1;
        int depth_right = maxDepth_recursion(root.right) + 1;
        return depth_left > depth_right ? depth_left : depth_right;
    }

    public static int maxDepth_BFS(TreeNode root)
    {
        if(root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int depth = 0;

        while(!queue.isEmpty())
        {
            int size = queue.size();

            // Iterate through nodes of the same level
            while(size > 0)
            {
                TreeNode node = queue.poll();

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);

                size--;
            }

            // Increment depth once all node of the same level are visited
            depth++;
        }

        return depth;
    }

    public static void main(String[] args)
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

        System.out.println("Depth of the tree using recursion is :"+ maxDepth_recursion(rootNode));
        System.out.println("Depth of the tree using iteration is :"+ maxDepth_BFS(rootNode));
    }


}
