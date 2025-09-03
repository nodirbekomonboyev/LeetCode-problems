package year2025;

import java.util.*;

public class Problem2089 {

    // https://leetcode.com/problems/find-target-indices-after-sorting-array/

    public List<Integer> targetIndices(int[] nums, int target) {
        int index = 0;
        int count = 0;
        for (int num : nums) {
            if(num < target) {
                index++;
            } else if (num == target) {
                count++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(index + i);
        }
        return result;
    }

}
