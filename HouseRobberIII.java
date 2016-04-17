/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 *
}
*/
public class Solution {

    private HashMap<TreeNode, Integer> visited = new HashMap<TreeNode, Integer>();

    public int rob(TreeNode root) {
        if (visited.containsKey(root)){
            return visited.get(root);
        } else if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return root.val;
        }


        int sumWithRoot = root.val;
        if (root.left != null) {
            sumWithRoot += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            sumWithRoot += rob(root.right.left) + rob(root.right.right);
        }

        int sumWithoutRoot = rob(root.left) + rob(root.right);

        int maxSum = Math.max(sumWithRoot, sumWithoutRoot);
        visited.put(root, maxSum);

        return maxSum;
    }
}