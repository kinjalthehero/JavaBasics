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

    /*
     * Steps for print vertical sum of binary tree:
     * Traverse tree in inorder traversal.
     * Create a variable level and initialise it with 0. When you traverse left child, decrease level by 1(level–) and when you traverse right child, increase level by 1(level++).
     * We need to maintain TreeMap with key as level and value as node data. If you get same key(level) again, then you need to add current node data to previous stored value to calculate sum.
     * For example:
     * TreeMap has entry with (0,40) where 0 is level and 40 is node data. So while traversing, if you encountered node 30 at level 0, so after processing node 30, TreeMap will have entry as (0,70)
     * Once TreeMap is populated after iterating all nodes, print the results.
     * Level is a made up variable where it can have value either 0 or 1
     */
    public static void printVertivalSumOfBinaryTree(TreeNode startNode, TreeMap<Integer,Integer> treeNodeMap, int level)
    {
        if(startNode==null)
        {
            return;
        }

        // Decrease level by 1 when iterating left child
        printVertivalSumOfBinaryTree(startNode.left, treeNodeMap,level-1);

        // TreeMap is similar to Hashmap
        // If we find level value then add the node value to the sum
        if(treeNodeMap.get(level) != null)
        {
            Integer sum = treeNodeMap.get(level) + startNode.data;
            // Adding current node data to previous stored value to get the sum
            treeNodeMap.put(level, sum);
        }
        // otherwise put the value in the map
        else
        {

            treeNodeMap.put(level, startNode.data);
        }

        // Increase level by 1 when iterating right child
        printVertivalSumOfBinaryTree(startNode.right, treeNodeMap,level+1);

    }
    public static void main(String[] args)
    {
        // Creating a binary tree
        TreeNode rootNode=createBinaryTree();
        System.out.println("Vertical sum of binary tree will be:");
        TreeMap<Integer,Integer> treeNodeMap=new TreeMap<Integer,Integer>();
        printVertivalSumOfBinaryTree(rootNode, treeNodeMap, 0);

        for(Map.Entry<Integer,Integer> entry:treeNodeMap.entrySet())
            System.out.println(entry.getValue());
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
