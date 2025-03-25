package year2025;

public class Problem2535 {

    // https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/

    public int differenceOfSum(int[] nums) {
        int sum  = 0, digitsSum = 0;

        for (int num : nums) {
            sum += num;
            while(num > 0){
                digitsSum += num % 10;
                num /= 10;
            }
        }
        return Math.abs(sum - digitsSum);
    }
}
