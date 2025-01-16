package year2025;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Problem1161 {

    // https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(3);
        treeNode.left = new TreeNode(2);

        Problem1161 problem1161 = new Problem1161();
        System.out.println("problem1161.maxLevelSum(treeNode) = " + problem1161.maxLevelSum(treeNode));
    }

    public int maxLevelSum(TreeNode root) {
        Map<Integer, Integer> sums = new HashMap<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 1;
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            int sum = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if(node != null) sum += node.val;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            sums.put(level++, sum);
        }
        int result = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < sums.size() + 1; i++) {
            if(sums.get(i) > max){
                max = sums.get(i);
                result = i;
            }
        }

        return result;
    }
}
