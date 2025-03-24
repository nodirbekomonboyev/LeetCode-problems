package year2025;

import java.util.List;

public class Problem2859 {

    // https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/
    /**
     * 000
     * 001
     * 010
     * 011
     * 100
     * 101
     * 110
     * 111
     *
     *
     * */

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i=0;i<nums.size();i++){
            if (Integer.bitCount(i) == k){
                sum += nums.get(i);
            }
        }
        return sum;
    }
}
