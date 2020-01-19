package practiceProblems.binaryTree;

import java.util.Stack;

/*
* Java Program to traverse a binary tree 
* using postOrder traversal without recursion. 
* In postOrder traversal first left subtree is visited, followed by right subtree
* and finally data of root or current node is printed.
* 
* input:
*       45
*      / \
*     25  55
*    / \    \
*   15  35   65
*  /   /  \
* 5   77   88
* 
* output: 5 15 35 25 77 88 65 55 45 
*/

public class BT_PostOrderTraversal {

	public static void main(String[] args) throws Exception {
	
		// construct the binary tree given in question
		BinaryTree_PostOrder bt = BinaryTree_PostOrder.create();
		
		// traversing binary tree using post order traversal using recursion
		System.out.println("printing nodes of binary tree on post order using recursion");
		
		bt.postOrder();
		
		System.out.println(); // insertLast new line
		
		// traversing binary tree on post order traversal without recursion
		System.out.println("printing nodes of binary tree on post order using iteration");
		bt.postOrderWithoutRecursion();
	}
}

class BinaryTree_PostOrder {
	
	static class TreeNode {
		String data;
		TreeNode left, right;
		
		TreeNode(String value) {
			this.data = value;
			left = right = null;
		}
		
		boolean isLeaf() {
			return left == null ? right == null : false;
		}
	}
	
	// root of binary tree
	TreeNode root;
	
	public void postOrder() {
		postOrder(root);
	}
	
	// Using recursion
	private void postOrder(TreeNode node) {
		if (node == null) {
			return;
		}
	
		postOrder(node.left); 
		postOrder(node.right);
		System.out.printf("%s ", node.data);
	}

	// Left -> Right -> Print
	public void postOrderWithoutRecursion()
	{
		Stack<TreeNode> nodes = new Stack<>();
		nodes.push(root);
		
		while (!nodes.isEmpty())
		{
			TreeNode current = nodes.peek();
		
			if (current.isLeaf())
			{
				TreeNode node = nodes.pop();
				System.out.printf("%s ", node.data);
			}
			else if(current.right != null)
			{
					nodes.push(current.right);
					current.right = null;
			}

			if(current.left != null){
				nodes.push(current.left);
				current.left = null;
			}
		}
	}
	
	public static BinaryTree_PostOrder create() {
		BinaryTree_PostOrder tree = new BinaryTree_PostOrder();
		TreeNode root = new TreeNode("45");
		tree.root = root;
		tree.root.left = new TreeNode("25");
		tree.root.left.left = new TreeNode("15");
		tree.root.left.left.left = new TreeNode("5");
		
		tree.root.left.right = new TreeNode("35");
		tree.root.right = new TreeNode("55");
		tree.root.right.right = new TreeNode("65");
		tree.root.right.right.left = new TreeNode("77");
		tree.root.right.right.right = new TreeNode("88");
	
		return tree;
	}

}