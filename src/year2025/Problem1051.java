package year2025;

import java.util.Arrays;

public class Problem1051 {

    // https://leetcode.com/problems/height-checker/

    public int heightChecker(int[] heights) {
        int[] exp = heights.clone();
        Arrays.sort(exp);
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != exp[i]){
                res++;
            }
        }
        return res;
    }
}
