package practiceProblems.binaryTree;

import java.util.Map;
import java.util.TreeMap;

public class BT_VerticalSum {

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

    public static void printVertivalSumOfBinaryTree(TreeNode node, TreeMap<Integer,Integer> map, int level)
    {
        if (node == null)
            return;

        if(map.get(level) != null)
            map.put(level, (map.get(level) + node.data));
        else
            map.put(level, node.data);

        printVertivalSumOfBinaryTree(node.left, map,level-1);
        printVertivalSumOfBinaryTree(node.right, map,level+1);
    }

    public static void main(String[] args)
    {
        // Creating a binary tree
        TreeNode rootNode=createBinaryTree();
        System.out.println("Vertical sum of binary tree will be:");
        TreeMap<Integer,Integer> treeNodeMap=new TreeMap<Integer,Integer>();
        printVertivalSumOfBinaryTree(rootNode, treeNodeMap, 0);

        for(Map.Entry<Integer,Integer> entry:treeNodeMap.entrySet())
            System.out.println(entry.getKey() + ": " +entry.getValue());
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
        TreeNode node55=new TreeNode(55);
        TreeNode node5=new TreeNode(5);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;
        node50.right=node55;
        node30.left=node5;
        return rootNode;
    }
}
