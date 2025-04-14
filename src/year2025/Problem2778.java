package year2025;

public class Problem2778 {

    // https://leetcode.com/problems/sum-of-squares-of-special-elements/

    public int sumOfSquares(int[] nums) {
        int n = nums.length, sum = 0;
        for (int i = 0; i < n; i++) {
            if(n % (i + 1) == 0){
                sum += nums[i] * nums[i];
            }
        }
        return sum;
    }
}
