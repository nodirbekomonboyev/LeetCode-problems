package year2025;

public class Problem3131 {

    // https://leetcode.com/problems/find-the-integer-added-to-array-i/

    public int addedInteger(int[] nums1, int[] nums2) {
        int sum = 0;
        for (int i : nums2) {
            sum += i;
        }
        for (int i : nums1) {
            sum -= i;
        }
        return sum / nums1.length;
    }
}
