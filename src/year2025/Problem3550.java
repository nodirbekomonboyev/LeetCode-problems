package year2025;

public class Problem3550 {
    // https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/

    public int smallestIndex(int[] nums) {
        int min = -1;
        for (int i = 0; i < nums.length; i++) {
            if(sumOfDigits(nums[i]) == i){
                if(min == -1){
                    min = nums.length;
                }
                min = Math.min(min, i);
            }
        }
        return min;
    }

    private int sumOfDigits(int i){
        int sum = 0;
        while (i > 0){
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
