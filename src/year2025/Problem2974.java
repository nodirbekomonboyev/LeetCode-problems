package year2025;

import java.util.Arrays;

public class Problem2974 {

    // https://leetcode.com/problems/minimum-number-game/

    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            int alice = nums[i];
            int bob = nums[i + 1];
            nums[i] = bob;
            nums[i + 1] = alice;
        }
        return nums;
    }
}
