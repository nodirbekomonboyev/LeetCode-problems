package year2025;

import java.util.*;

public class Problem2553 {

    public static void main(String[] args) {
        Problem2553 problem2553 = new Problem2553();
        problem2553.separateDigits(new int[]{13,25, 83, 77});
    }

    // https://leetcode.com/problems/separate-the-digits-in-an-array/

    public int[] separateDigits(int[] nums) {
        List<Integer> digits = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int n = nums[i];
            while (n > 0){
                digits.add(n % 10);
                n /= 10;
            }
        }
        int[] ans = new int[digits.size()];
        int k = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            ans[k] = digits.get(i);
            k++;
        }
        return ans;
    }
}
