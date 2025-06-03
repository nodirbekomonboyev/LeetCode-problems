package year2025;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem2913 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        Problem2913 problem2913 = new Problem2913();
        System.out.println("problem2913.sumCounts(nums) = " + problem2913.sumCounts(nums));
    }

    // https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/

    public int sumCounts(List<Integer> nums) {
        int result = 0, length = nums.size(), w = 1;
        while (w <= length){
            for (int i = 0; i + w <= length; i++) {
                Set<Integer> values = new HashSet<>();
                for (int j = i; j < i + w; j++) {
                    values.add(nums.get(j));
                }
                int size = values.size();
                result += size * size;
            }
            w++;
        }
        return result;
    }
}
