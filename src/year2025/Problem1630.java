package year2025;

import java.util.*;

public class Problem1630 {
    public static void main(String[] args) {
        Problem1630 problem1630 = new Problem1630();
//        List<Boolean> booleans = problem1630.checkArithmeticSubarrays(new int[]{1, 1, 7, 7}, new int[]{0}, new int[]{3});
        List<Boolean> booleans = problem1630.checkArithmeticSubarrays(new int[]{4,6,5,9,3,7}, new int[]{0}, new int[]{2});
        System.out.println("booleans.toString() = " + booleans.toString());

    }
    // https://leetcode.com/problems/arithmetic-subarrays/

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            res.add(helper(nums, l[i], r[i]));
        }
        return res;
    }

    private Boolean helper(int[] nums, int i, int j) {
        int[] list = new int[j - i + 1];
        if (j + 1 - i >= 0) System.arraycopy(nums, i, list, 0, j + 1 - i);
        Arrays.sort(list);
        int d = list[1] - list[0];
        for (int k = 1; k < list.length - 1; k++) {
            if(list[k + 1] - list[k] != d){
                return false;
            }
        }
        return true;
    }

}
