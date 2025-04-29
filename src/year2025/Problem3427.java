package year2025;

public class Problem3427 {

    // https://leetcode.com/problems/sum-of-variable-length-subarrays/

    public int subarraySum(int[] nums) {
        int length = nums.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int start = Math.max(0, i - nums[i]);
            for (int j = start; j <= i; j++) {
                sum += nums[j];
            }
        }
        return sum;
    }


}
