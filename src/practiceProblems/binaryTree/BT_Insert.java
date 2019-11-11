package practiceProblems.binaryTree;

import apple.laf.JRSUIUtils;

import java.util.LinkedList;
import java.util.Queue;

public class BT_Insert {
 
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

	public static TreeNode insert (TreeNode root, TreeNode node)
	{
		// base condition
		if (root == null)
			return node;

		if (node.data < root.data)
			root.left = insert(root.left, node);
		else
			root.right = insert(root.right, node);

		return root;
	}

	public static boolean search (TreeNode root,TreeNode node)
	{
		if(root == null)
			return false;

		if(root.data == node.data)
			return true;

		boolean result = false;

		if(root.data > node.data)
			result = search (root.left, node);
		else if(root.data < node.data)
			result = search (root.right, node);

		return result;
	}

	public static void main(String[] args)
	{
		// Creating a binary tree
		TreeNode rootNode=createBinaryTree();

		inOrder(rootNode);
		System.out.println();

		System.out.println("Level Order traversal of binary tree will be:");
		TreeNode node5=new TreeNode(5);
		insert(rootNode, node5);

		inOrder(rootNode);
		System.out.println();

		TreeNode node80=new TreeNode(80);
		insert(rootNode, node80);

		inOrder(rootNode);
		System.out.println();

		TreeNode node20=new TreeNode(25);
		insert(rootNode, node20);
		System.out.println();

		inOrder(rootNode);
		System.out.println();

		TreeNode node100=new TreeNode(100);
		System.out.println(search(rootNode,node20));
		System.out.println(search(rootNode,node100));

	}

	// Using recursion
	public static void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.printf("%s ", node.data);
		inOrder(node.right);
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