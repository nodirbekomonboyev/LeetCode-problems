package year2025;

public class Problem3300 {

    // https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/

    public int minElement(int[] nums) {
        int result = Integer.MAX_VALUE;
        for (int num : nums) {
            int digitsSum = 0;
            while (num > 0){
                digitsSum += num % 10;
                num /= 10;
            }
            result = Math.min(digitsSum, result);
        }
        return result;
    }
}
