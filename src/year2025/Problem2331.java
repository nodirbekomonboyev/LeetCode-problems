package year2025;

public class Problem2331 {

    // https://leetcode.com/problems/evaluate-boolean-binary-tree/

    public boolean evaluateTree(TreeNode root) {
        if(root == null) return false;
        if(root.val == 2){
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else if(root.val == 3){
            return evaluateTree(root.left) && evaluateTree(root.right);
        } else {
            return root.val == 1;
        }
    }
}
