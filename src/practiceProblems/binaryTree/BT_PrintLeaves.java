package practiceProblems.binaryTree;

/*
 * Java Program to print all leaf nodes of binary tree 
 * using recursion
 * input :   a
 *          / \
 *         b   f
 *        / \  / \
 *       c   e g  h
 *      /          \ 
 *     d            k 
 * 
 * output: d e g k 
 */

import java.util.Stack;

public class BT_PrintLeaves {

  private static class TreeNode {
    
	String value;
    TreeNode left;
    TreeNode right;

    TreeNode(String value) {
    	this.value = value;
    }

    TreeNode(String data, TreeNode left, TreeNode right) {
    	this.value = data;
    	this.left = left;
    	this.right = right;
    }

    boolean isLeaf() {
    	return left == null ? right == null : false;
    }
  }

  // Print leaf nodes using recursion
  public static void printLeaves(TreeNode node) {
    
	// base case
    if (node == null) 
    	return;
    
    if (node.isLeaf()) 
    	System.out.printf("%s ", node.value);

    printLeaves(node.left);
    printLeaves(node.right);
  }

  static void printLeaves_iteration (TreeNode node)
	{
		Stack<TreeNode> stack = new Stack<>();
		stack.push(node);

		while (!stack.isEmpty())
		{
			TreeNode tempNode = stack.pop();

			if (tempNode.left == null && tempNode.right == null)
			{
				System.out.print(tempNode.value + " ");
			}

			// NOTE: As we are using stack, first insert right so that left will pop first
			if (tempNode.right != null)
				stack.push(tempNode.right);

			if (tempNode.left != null)
				stack.push(tempNode.left);
		}
	}
  
  public static void main(String[] args) throws Exception {

	  /*
	   * Java Program to print all leaf nodes of binary tree 
	   * using recursion
	   * input :   a
	   *          / \
	   *         b   f
	   *        / \  / \
	   *       c   e g  h
	   *      /          \ 
	   *     d            k 
	   * 
	   * output: d e g k 
	   */
	  
	    // All leaf nodes
	    TreeNode d = new TreeNode("d");
	    TreeNode e = new TreeNode("e");
	    TreeNode g = new TreeNode("g");
	    TreeNode k = new TreeNode("k");

	    // c is a parent of d
	    TreeNode c = new TreeNode("c", d, null);
	    TreeNode h = new TreeNode("h", k, null);

	    // b is a parent of c and e
	    TreeNode b = new TreeNode("b", c, e);
	    TreeNode f = new TreeNode("f", g, h);

	    TreeNode root = new TreeNode("a", b, f);

	    // print all leaf nodes of binary tree using recursion
	    System.out.println("Printing all leaf nodes of binary tree in Java (recursively)");
	    printLeaves(root);
	  printLeaves_iteration(root);

	  }
}