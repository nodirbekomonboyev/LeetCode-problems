package year2025;

public class Problem2373 {

    // https://leetcode.com/problems/largest-local-values-in-a-matrix/

    public int[][] largestLocal(int[][] grid) {
        int l = grid.length;
        int[][] res = new int[l-2][l-2];
        for (int i = 1; i < l - 1; i++) {
            for (int j = 1; j < l - 1; j++) {
                int max = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int m = j - 1; m <= j + 1; m++) {
                        max = Math.max(max, grid[k][m]);
                    }
                }
                res[i - 1][j - 1] = max;
            }
        }
        return res;
    }
}
