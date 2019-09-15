package practiceProblems.binarysearchtree;

public class BST_searchAndInsert {

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

    public static boolean search(TreeNode root,TreeNode node)
    {
        if(root == null)
            return false;

        if(root.data == node.data)
        {
            return true;
        }

        boolean result=false;

        if(root.data > node.data)
            result = search(root.left, node);
        else if(root.data < node.data)
            result = search(root.right, node);

        return result;
    }

    public static TreeNode insert_rec (TreeNode root, TreeNode node)
    {
        if(root == null)
            return node;

        if(node.data < root.data)
            root.left = insert_rec(root.left, node);
        else if(root.data < node.data)
            root.right = insert_rec(root.right, node);

        return root;
    }

    public static TreeNode insert_iterative (TreeNode root, TreeNode node)
    {
        if(root == null)
            return node;

        TreeNode curr = root, prev = null;

        while (curr != null)
        {
            prev = curr;
            if(node.data < curr.data)
                curr = curr.left;
            else
                curr = curr.right;
        }

        if (prev.data < node.data)
            prev.right = node;
        else
            prev.left = node;

        return root;
    }

    public static void inOrder(TreeNode root)
    {
        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args)
    {

        // Creating a binary search tree
        TreeNode rootNode=createBinarySearchTree();
        TreeNode node55=new TreeNode(55);
        boolean result=search(rootNode,node55);
        System.out.println("Searching for node 55 : "+result);
        System.out.println("---------------------------");
        TreeNode node13=new TreeNode(13);
        TreeNode root=insert_iterative(rootNode,node13);
        System.out.println("Inorder traversal of binary tree after adding 13:");
        inOrder(root);

    }

    public static TreeNode createBinarySearchTree()
    {
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);
        TreeNode node5=new TreeNode(5);
        TreeNode node55=new TreeNode(55);

        insert_iterative(null,rootNode);
        insert_iterative(rootNode,node20);
        insert_iterative(rootNode,node10);
        insert_iterative(rootNode,node30);
        insert_iterative(rootNode,node60);
        insert_iterative(rootNode,node50);
        insert_iterative(rootNode,node70);
        insert_iterative(rootNode,node5);
        insert_iterative(rootNode,node55);
        return rootNode;
    }
}
