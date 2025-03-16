package year2025;

public class Problem3162 {

    // https://leetcode.com/problems/find-the-number-of-good-pairs-i/

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if(i % (j * k) == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
