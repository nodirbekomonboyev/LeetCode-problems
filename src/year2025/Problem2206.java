package year2025;

import java.util.Arrays;

public class Problem2206 {

    // https://leetcode.com/problems/divide-array-into-equal-pairs/

    public boolean divideArray(int[] nums) {
        int[] count = new int[1000];
        for (int num : nums) {
            count[num - 1]++;
        }

        for (int i : count) {
            if(i % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
