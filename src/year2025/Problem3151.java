package year2025;

public class Problem3151 {

    // https://leetcode.com/problems/special-array-i/

    public boolean isArraySpecial(int[] nums) {
        boolean condition = nums[0] % 2 == 0;
        for (int i = 1; i < nums.length; i++) {
            if(condition == (nums[i] % 2 == 0)){
                return false;
            } else {
                condition = nums[i] % 2 == 0;
            }
        }
        return true;
    }
}
