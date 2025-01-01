package year2024.november;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root != null){
            int result = Math.max(maxDepth(root.left), maxDepth(root.right));
            return ++result;
        }
        return 0;
    }
}
