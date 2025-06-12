package year2025;

import java.util.*;

public class Problem1748 {

    // https://leetcode.com/problems/sum-of-unique-elements/

    public int sumOfUnique(int[] nums) {
        List<Integer> uniques = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            boolean unique = true;
            for (int j = 0; j < nums.length; j++) {
                if(i != j && num == nums[j]){
                    unique = false;
                    break;
                }
            }
            if(unique){
                uniques.add(num);
            }
        }
        Integer sum = 0;
        for (Integer unique : uniques) {
            sum += unique;
        }
        return sum;
    }
}
