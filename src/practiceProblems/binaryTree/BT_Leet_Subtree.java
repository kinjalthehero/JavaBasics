package practiceProblems.binaryTree;

public class BT_Leet_Subtree {

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;

       TreeNode(int x)
       {
           val = x;
       }
    }

    public boolean isSubtree(TreeNode origtree, TreeNode subtree)
    {
        if (origtree == null)
            return false;

        if (isSame(origtree, subtree))
            return true;

        return isSubtree(origtree.left, subtree) || isSubtree(origtree.right, subtree);
    }

    private boolean isSame(TreeNode s, TreeNode t)
    {
        if (s == null && t == null)
            return true;

        if (s == null || t == null)
            return false;

        if (s.val != t.val)
            return false;

        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
}
