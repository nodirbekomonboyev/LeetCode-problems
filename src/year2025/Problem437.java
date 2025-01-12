package year2025;

import java.util.HashMap;
import java.util.Map;

public class Problem437 {
    //https://leetcode.com/problems/path-sum-iii/description/
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 10;
        treeNode.right = new TreeNode(-3);
        treeNode.right.right = new TreeNode(11);
        treeNode.left = new TreeNode(5);
        treeNode.left.right = new TreeNode(2);
        treeNode.left.right.right = new TreeNode(1);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.left.right = new TreeNode(-2);
        treeNode.left.left.left = new TreeNode(3);

        Problem437 problem437 = new Problem437();
        System.out.println(problem437.pathSum(treeNode, 8));

    }

    //https://leetcode.com/problems/path-sum-iii/submissions/1500265418/?envType=study-plan-v2&envId=leetcode-75
    private Map<Long, Integer> hmap;
    private int count;

    public int pathSum(TreeNode root, int targetSum) {
        hmap = new HashMap<>();
        count = 0;

        dfs(root, 0, targetSum);

        return count;
    }

    private void dfs(TreeNode root, long prefixSum, int targetSum) {
        if (root == null) return;

        prefixSum += root.val;

        if (hmap.containsKey(prefixSum-targetSum)){
            count += hmap.get(prefixSum-targetSum);
        }

        if (targetSum == prefixSum){
            count++;
        }

        hmap.put(prefixSum, hmap.getOrDefault(prefixSum, 0) + 1);

        dfs(root.left, prefixSum, targetSum);
        dfs(root.right, prefixSum, targetSum);

        hmap.put(prefixSum, hmap.get(prefixSum) - 1);
    }
}
