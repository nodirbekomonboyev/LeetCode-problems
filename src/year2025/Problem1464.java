package year2025;

import java.util.Arrays;

public class Problem1464 {

    // https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return (nums[length - 1] - 1) * (nums[length - 2] - 1);
    }
}
