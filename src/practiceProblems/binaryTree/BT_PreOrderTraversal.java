package practiceProblems.binaryTree;

import java.util.Stack;

/*
 * Print -> Left -> Right
 * Java Program to traverse a binary tree using PreOrder traversal. 
 * In PreOrder the node value is printed first, followed by visit
 * to left and right subtree. 
 * input:
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6
 * 
 * output: 1 2 3 4 5 6 
 */

public class BT_PreOrderTraversal {
	
	static class BinaryTree {

		TreeNode root;

		public static class TreeNode {
		    
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

		public void preOrder() {
			preOrder(root);
		}

		// with recursion
		private void preOrder(TreeNode node) {
			
			if (node == null) 
				return;
		 
			System.out.printf("%s ", node.data);
			preOrder(node.left);
			preOrder(node.right);
		}

		// without recursion using stack
		public void preOrderWithoutRecursion() {
			
			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);

			while (!stack.isEmpty()) {
				
				TreeNode current = stack.pop();
				System.out.printf(current.data + " ");

				if (current.right != null) 
					stack.push(current.right);
		    
				if (current.left != null) 
					stack.push(current.left);
			}
		}
	}

  public static void main(String[] args) throws Exception {

    // construct the binary tree given in question
    BinaryTree bt = new BinaryTree();
    BinaryTree.TreeNode root = new BinaryTree.TreeNode("1");
    bt.root = root;
    bt.root.left = new BinaryTree.TreeNode("2");
    bt.root.left.left = new BinaryTree.TreeNode("3");

    bt.root.left.right = new BinaryTree.TreeNode("4");
    bt.root.right = new BinaryTree.TreeNode("5");
    bt.root.right.right = new BinaryTree.TreeNode("6");

    // printing nodes in recursive preOrder traversal algorithm
    bt.preOrder();

    System.out.println();

    // traversing binary tree in PreOrder without using recursion
    bt.preOrderWithoutRecursion();

  }

}



