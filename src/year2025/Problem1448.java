package year2025;

public class Problem1448 {
    // https://leetcode.com/problems/count-good-nodes-in-binary-tree/?envType=study-plan-v2&envId=leetcode-75

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(9);
        treeNode.right = new TreeNode(3);
        treeNode.right.right = new TreeNode(6);


    }

    // https://leetcode.com/problems/count-good-nodes-in-binary-tree/solutions/6259680/easy-solution-beats-100-recursion-java-b-3ep1/

    public int goodNodes(TreeNode root) {
        return helper(root.left, root.val) + helper(root.right, root.val) + 1;
    }

    private int helper(TreeNode root, int num){
        int count = 0, left = 0, right = 0, val;
        if(root == null){
            return 0;
        }
        if(root.val >= num){
            val = root.val;
            count++;
        }else {
            val = num;
        }
        if(root.left != null){
            left = helper(root.left, val);
        }
        if(root.right != null){
            right = helper(root.right, val);
        }

        return count + left + right;
    }
}
