package year2025;

import java.util.Arrays;

public class Problem2656 {

    // https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/

    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        int n = nums.length;

        for(int i =n-1 ; i>= 0 ;i--){
            max = Math.max(nums[i],max);
        }

        max *= k;
        max = max + ((( k-1) * k)/2);
        return max;
    }
}
