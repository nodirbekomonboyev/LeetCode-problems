package year2025;

import java.util.LinkedList;
import java.util.Queue;

public class Problem1926 {

    // https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/description

    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        int rows = maze.length;
        int cols = maze[0].length;
        maze[entrance[0]][entrance[1]] = '+';
        int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
        int level = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                int[] curr = queue.poll();
                for(int[] dir: dirs) {
                    int x = dir[0] + curr[0];
                    int y = dir[1] + curr[1];
                    if(x < 0 || x >= rows || y < 0 || y >= cols) continue;
                    if(maze[x][y] == '+') continue;
                    if(x == 0 || y == 0 || x == rows-1 || y == cols - 1) {
                        return level + 1;
                    }
                    maze[x][y] = '+';
                    queue.offer(new int[]{x,y});
                }
            }
            level++;
        }
        return -1;
    }
}
