package year2025;

import java.util.Arrays;

public class Problem2500 {
    // https://leetcode.com/problems/delete-greatest-value-in-each-row/

    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int sum = 0;
        for (int[] row : grid) {
            Arrays.sort(row);
        }
        for (int j = 0; j < n; j++) {
            int maxVal = 0;

            for (int i = 0; i < m; i++) {
                maxVal = Math.max(maxVal, grid[i][j]);
            }
            sum += maxVal;
        }

        return sum;
    }
}
