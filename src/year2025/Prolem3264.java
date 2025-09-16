package year2025;

public class Prolem3264 {
    // https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k > 0){
            int index = 0;
            int min = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if(nums[i] < min){
                  index = i;
                  min = nums[i];
                }
            }
            nums[index] *= multiplier;
            k--;
        }
        return nums;
    }
}
