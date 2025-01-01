package year2024.november;

public class OrangeRotting {
    public int orangesRotting(int[][] grid) {
        int point = 0;
        for (int[] ints : grid) {
            for (int i : ints) {
                if(i  == 1){
                    point++;
                }
            }
        }
        if (point == 0){
            return 0;
        }
        int minute = 0;
        int progress = 1;
        while(progress == 0) {
            progress = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if(grid[i][j] == 2){
                        int n = i;
                        int m = j;
                        if(i == 0 && j == 0){
                            return 1;
                        }
                    }
                }
            }
        }
        return -1;
    }
    /*

      [[0,2,2]]
      [[2,2,2,1,1]]
      [[2,2],[1,1],[0,0],[2,0]]

      */
}
