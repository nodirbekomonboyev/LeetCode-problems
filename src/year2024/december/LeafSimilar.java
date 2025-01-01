package year2024.december;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilar {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        leafNode(root1,list1);
        leafNode(root2,list2);

        return list1.equals(list2);
    }
    public void leafNode(TreeNode root, List<Integer> arr){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            arr.add(root.val);
        }
        leafNode(root.left,arr);
        leafNode(root.right,arr);
    }
}
