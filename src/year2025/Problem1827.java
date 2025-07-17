package year2025;

public class Problem1827 {


    // https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/


    public static void main(String[] args) {
        Problem1827 problem1827 = new Problem1827();
        problem1827.minOperations(new int[]{1,5,2,4,1});
    }

    public int minOperations(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int sum = 0;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= prev) {
                sum += prev + 1 - nums[i];
                prev++;
            } else {
                prev = nums[i];
            }
        }
        return sum;
    }
}
