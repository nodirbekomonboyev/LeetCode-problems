package year2025;

public class Problem1372 {
    // https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description/
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = -1;
        treeNode.right = new TreeNode(-1);
        treeNode.right.right = new TreeNode(1);
        treeNode.right.left = new TreeNode(-1);
        treeNode.right.right.right = new TreeNode(-1);
        treeNode.right.right.left = new TreeNode(2);
        treeNode.right.right.left.right = new TreeNode(3);
        treeNode.right.right.left.right.right = new TreeNode(-1);

        Problem1372 problem1372 = new Problem1372();
        System.out.println("problem1372.longestZigZag(treeNode) = " + problem1372.longestZigZag(treeNode));
    }



    // https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/submissions/1502547708/?envType=study-plan-v2&envId=leetcode-75
    public int longestZigZag(TreeNode root) {
        return Math.max(helper(root.left,1,false),helper(root.right,1,true))-1;
    }
    public int helper(TreeNode root,int count, boolean direction) {
        if(root == null){
            return count;
        }

        int left, right;

        if(direction) {
            left = helper(root.left,count+1,false);
            right = helper(root.right,1,true);
        } else {
            right = helper(root.right,count+1,true);
            left = helper(root.left,1,false);
        }
        return Math.max(right, left);
    }
}
