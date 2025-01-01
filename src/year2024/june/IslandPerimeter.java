package year2024.june;

public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int[] ints : grid) {
            for (int i : ints) {
                count += i;
            }
        }
        int ans = count * 4;
        int x = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < ints.length; j++) {
                if (j + 1 < ints.length) {
                    if (ints[j] == 1 && ints[j + 1] == 1) {
                        x++;
                    }
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(i + 1 < grid.length){
                    if(grid[i][j] == 1 && grid[i + 1][j] == 1){
                        x++;
                    }
                }
            }
        }
        x *= 2;
        return ans - x;
    }
}
