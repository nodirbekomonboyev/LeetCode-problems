package year2025;

import javax.swing.*;
import java.util.stream.Stream;

public class Problem450 {

    // https://leetcode.com/problems/delete-node-in-a-bst/description/

    public static void main(String[] args) {

    }


    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val > key){
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            if (root.right == null){
                return root.left;
            }

            TreeNode node = helper(root.right);
            root.val = node.val;
            root.right = deleteNode(root.right, node.val);
        }
        return root;
    }
    
    private TreeNode helper(TreeNode node){
        while (node.left != null){
            node = node.left;
        }
        return node;
    }
}
