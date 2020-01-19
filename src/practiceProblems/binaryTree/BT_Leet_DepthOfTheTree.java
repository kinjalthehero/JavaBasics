package practiceProblems.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BT_Leet_DepthOfTheTree {

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

    static int maxDepth_recursion(Node root)
    {

        if(root == null)
            return 0;

        int depth_left = maxDepth_recursion(root.left) + 1;
        int depth_right = maxDepth_recursion(root.right) + 1;
        return depth_left > depth_right ? depth_left : depth_right;
    }

    static int maxDepth_recursion_kinjal(Node root, int depth)
    {

        if(root == null)
            return depth;

        int depth_left = maxDepth_recursion_kinjal(root.left, depth+1);
        int depth_right = maxDepth_recursion_kinjal(root.right, depth+1);

        return (depth_left > depth_right) ? depth_left : depth_right;
    }

    public static int maxDepth_BFS(Node root)
    {
        if(root == null)
            return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int depth = 0;

        while(!queue.isEmpty())
        {
            int size = queue.size();

            // Iterate through nodes of the same level
            while(size > 0)
            {
                Node node = queue.poll();

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

    static int depth (Node node) {

        if (node == null)
            return 0;

        int leftDepth = 1 + depth(node.left);
        int rightDepth = 1 + depth(node.right);

        return (leftDepth > rightDepth)? leftDepth:rightDepth;
    }

    public static void main(String[] args)
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

        System.out.println("Depth of the tree using recursion is :"+ maxDepth_recursion(rootNode));
        System.out.println("Depth of the tree using recursion is :"+ maxDepth_recursion_kinjal(rootNode, 0));
        System.out.println("Depth of the tree using iteration is :"+ maxDepth_BFS(rootNode));
        System.out.println("Depth of the tree using iteration is :"+ depth(rootNode));
    }


}
