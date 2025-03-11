package year2025;

public class Problem3467 {

    // https://leetcode.com/problems/transform-array-by-parity/

    public int[] transformArray(int[] nums) {
        int index = nums.length;
        int[] res = new int[index--];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0){
                res[index--] = 1;
            }
        }
        return res;
    }
}
