package year2025;

public class Problem994 {

    // https://leetcode.com/problems/rotting-oranges/description

    public static void main(String[] args) {

    }


    public int orangesRotting(int[][] grid) {
        int minutes = 0;
        boolean process = true;
        while(process){
            process = false;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if(grid[i][j] == 2){

                    }
                }
            }
        }
        return -1;
    }

    private boolean check(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(i == 0 && j == 0){

                }
            }
        }
    }
}
