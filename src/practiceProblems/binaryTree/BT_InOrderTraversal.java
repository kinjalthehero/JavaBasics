package practiceProblems.binaryTree;

import java.util.Stack;

/*
 * In order: Left -> Print -> Right
 * Java Program to traverse a binary tree 
 * using inorder traversal without recursion. 
 * In InOrder traversal first left node is visited, followed by root
 * and right node.
 * 
 * input:
 *     4
 *    / \
 *   2   5
 *  / \   \
 * 1   3   6
 * 
 * output: 1 2 3 4 5 6 
 */

public class BT_InOrderTraversal {

  public static void main(String[] args) throws Exception {

	  // construct the binary tree given in question
	  BinaryTree bt = BinaryTree.create();

	  // traversing binary tree using InOrder traversal using recursion
	  System.out.println("printing nodes of a binary tree on InOrder using recursion");

	  bt.inOrder();

	  System.out.println(); // insertLast new line

	  // traversing binary tree on InOrder traversal without recursion
	  System.out.println("printing nodes of binary tree on InOrder using iteration");
	  bt.inOrderWithoutRecursion();
  }

}

class BinaryTree {

	// root of binary tree
	TreeNode root;
	  
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

  public void inOrder() {
    inOrder(root);
  }

  // Using recursion
  private void inOrder(TreeNode node) {
    if (node == null) {
      return;
    }

    inOrder(node.left);
    System.out.printf("%s ", node.data);
    inOrder(node.right);
  }

  // Without recursion
  public void inOrderWithoutRecursion()
  {
      Stack stack = new Stack<>();
      TreeNode current = root;

      while (!stack.isEmpty() || current != null)
      {
        if (current != null)
        {
            stack.push(current);
    	    current = current.left;
        }
        else
        {
            TreeNode node = (TreeNode)stack.pop();
    	    System.out.printf("%s ", node.data);
    	    current = node.right;
        }
    }
  }

  public static BinaryTree create() {
	  BinaryTree tree = new BinaryTree();
    TreeNode root = new TreeNode("4");
    tree.root = root;
    tree.root.left = new TreeNode("2");
    tree.root.left.left = new TreeNode("1");

    tree.root.left.right = new TreeNode("3");
    tree.root.right = new TreeNode("5");
    tree.root.right.right = new TreeNode("6");

    return tree;
  }

}

