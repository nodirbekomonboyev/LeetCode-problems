package year2025;

import java.util.HashMap;
import java.util.Map;

public class Problem1365 {

    // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] point = new int[101];
        for (int num : nums) {
            point[num]++;
        }
        Map<Integer, Integer> points = new HashMap<>();
        for (int i = 0,count = 0; i < point.length; i++) {
            points.put(i, count);
            count += point[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = points.get(nums[i]);
        }
        return nums;
    }
}
