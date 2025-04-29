package year2025;

public class Problem2176 {

    // https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/

    public int countPairs(int[] nums, int k) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length ; j++) {
                if(nums[i] == nums[j] && (i * j) % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
