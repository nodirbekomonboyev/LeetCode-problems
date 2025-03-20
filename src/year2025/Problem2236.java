package year2025;

public class Problem2236 {

    // https://leetcode.com/problems/root-equals-sum-of-children/

    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
