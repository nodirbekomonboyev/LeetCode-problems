package year2025;

public class Problem547 {

    // https://leetcode.com/problems/number-of-provinces/description

    public static void main(String[] args) {
        int[][] isConnected = new int[][]{{1,1,0},{1,1,0},{0,0,1}};
        Problem547 problem547 = new Problem547();
        System.out.println("problem547.findCircleNum(isConnected) = " + problem547.findCircleNum(isConnected));
    }


    public int findCircleNum(int[][] isConnected) {
       int result = 0;
       boolean[] visited = new boolean[isConnected.length];
        for (int i = 0; i < isConnected.length; i++) {
            if(!visited[i]){
                result++;
                dfs(isConnected, visited, i);
            }
        }
        return result;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int i) {
       visited[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if(isConnected[i][j] == 1 && !visited[j]){
                dfs(isConnected, visited, j);
            }
        }
    }
}
