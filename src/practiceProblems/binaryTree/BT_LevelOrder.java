package practiceProblems.binaryTree;

import java.util.Queue;
import java.util.LinkedList;
public class BT_LevelOrder {
 
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
 
	// prints in level order
	public static void levelOrderTraversal(Node startNode) {
		
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(startNode);
		while(!queue.isEmpty())
		{
			Node tempNode=queue.poll();
			System.out.printf("%d ",tempNode.data);
			if(tempNode.left!=null)
				queue.add(tempNode.left);
			if(tempNode.right!=null)
				queue.add(tempNode.right);
		}
	}
	public static void main(String[] args)
	{
		// Creating a binary tree
		Node rootNode=createBinaryTree();
		System.out.println("Level Order traversal of binary tree will be:");
		levelOrderTraversal(rootNode);
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