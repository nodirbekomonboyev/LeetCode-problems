package year2025;

import java.util.ArrayList;
import java.util.List;

public class Problem1389 {

    // https://leetcode.com/problems/create-target-array-in-the-given-order/

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            temp.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];
        for (int i = 0; i < temp.size(); i++) {
            target[i] = temp.get(i);
        }
        return target;
    }
}
