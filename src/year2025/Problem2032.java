package year2025;

import java.util.*;

public class Problem2032 {
    public static void main(String[] args) {
        Problem2032 problem2032 = new Problem2032();
        System.out.println(" = " + problem2032.twoOutOfThree(new int[]{1, 1, 3, 2}, new int[]{2, 3}, new int[]{3}));
    }
    // https://leetcode.com/problems/two-out-of-three/

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int j : nums1) {
            set.add(j);
        }
        for (int j : nums2) {
            if (set.contains(j)) {
                result.add(j);
            }
            set2.add(j);
        }
        for (int j : nums3) {
            if (set.contains(j) || set2.contains(j)) {
                result.add(j);
            }
        }
        return new ArrayList<>(result);
    }
}
