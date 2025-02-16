package year2025;

import java.util.ArrayList;
import java.util.List;

public class Problem101 {

    // https://leetcode.com/problems/symmetric-tree/description/

    public boolean isSymmetric(TreeNode r) {
        return isReflection(r.left, r.right);
    }

    private boolean isReflection(TreeNode left, TreeNode right) {
        if(left == null && right == null){
            return true;
        }

        if(left == null || right == null){
            return false;
        }

        if(left.val == right.val){
            return isReflection(left.left, right.right) && isReflection(left.right, right.left);
        };
        return false;
    }
}
