package year2025;

public class Problem803 {
    // https://leetcode.com/problems/max-increase-to-keep-city-skyline/


    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < grid.length; j++) {
                int hMax = hMax(ints);
                int vMax = vMax(grid, j);
                result += Math.min(hMax, vMax) - ints[j];
            }
        }

        return result;
    }

    private int vMax(int[][] grid, int j) {
        int max = grid[0][j];
        for (int[] ints : grid) {
            if (max < ints[j]) {
                max = ints[j];
            }
        }
        return max;
    }

    private int hMax(int[] grid) {
        int max = grid[0];
        for (int i : grid) {
            if(max < i){
                max = i;
            }
        }
        return max;
    }


}
