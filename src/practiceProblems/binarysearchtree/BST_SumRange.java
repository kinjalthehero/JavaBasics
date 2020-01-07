package practiceProblems.binarysearchtree;

public class BST_SumRange {

    public static int rangeSumBST(TreeNode root, int L, int R)
    {
        if (root == null)
            return 0; // base case.
        if (root.data < L)
            return rangeSumBST(root.right, L, R); // left branch excluded.
        if (root.data > R)
            return rangeSumBST(root.left, L, R); // right branch excluded.

        return root.data + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R); // count in both children.
    }

    public static void main(String[] args)
    {
        TreeNode rootNode=createBinarySearchTree();
        System.out.println("Minimum element in binary search tree: "+ rangeSumBST(rootNode, 7, 15));
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

        insert(null,rootNode);
        insert(rootNode,node20);
        insert(rootNode,node10);
        insert(rootNode,node30);
        insert(rootNode,node60);
        insert(rootNode,node50);
        insert(rootNode,node70);
        insert(rootNode,node5);
        insert(rootNode,node55);

        return rootNode;
    }

    public static TreeNode insert(TreeNode root,TreeNode nodeToBeInserted)
    {
        if(root==null)
        {
            root=nodeToBeInserted;
            return root;
        }

        if(root.data > nodeToBeInserted.data)
        {
            if(root.left==null)
                root.left=nodeToBeInserted;
            else
                insert(root.left,nodeToBeInserted);
        }
        else if(root.data < nodeToBeInserted.data)
            if(root.right==null)
                root.right=nodeToBeInserted;
            else
                insert(root.right,nodeToBeInserted);
        return root;
    }

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
}
