package practiceProblems.binaryTree;

public class BT_SubtreeWithSumAsGivenNumber
{
    public static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public static pair solve (Node node, int target)
    {
        /* if current node is null, then its contribution to total sum of a subtree will be zero and also it won't have
         *  any subtree with sum equal to given target sum  */
        if(node == null)
        {
            return new pair(0, 0);
        }

        pair left = solve(node.left, target);
        pair right = solve(node.right, target);

        // sum of current subtree = sum of data of current node + sum of left child subtree + sum of right child subtree
        int sum = left.sum + right.sum + node.data;
        int count = left.count + right.count;

        /* count of subtrees with target sum will be the sum of count
         * of subtrees on left with sum equal to target, count of
         * subtrees on right with sum equal to target, and one if
         * the current subtree has sum equal to target*/
        if(sum == target)
        {
            count++;
        }
        return new pair(count, sum);
    }

    public static class pair {

        int count;
        int sum;

        // count: number of subtrees with given target sum
        // sum: sum of the current subtree (includes the sum of root)
        public pair(int count, int sum)
        {
            this.count = count;
            this.sum = sum;
        }
    }

    public static void main(String[] args) {

        Node root =  new Node(4);
        root. left = new Node(5);
        root. right = new Node(-2);
        root. left. left = new Node(-1);
        root. left. right = new Node(2);
        root. right. right = new Node(5);
        root. right. left = new Node(8);
        root. right. left. left = new Node(7);
        root. right. left. right = new Node(-9);

        System.out.println(solve(root, 6).count);

    }


}
