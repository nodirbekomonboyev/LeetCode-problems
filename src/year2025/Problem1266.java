package year2025;

public class Problem1266 {

    // https://leetcode.com/problems/minimum-time-visiting-all-points/

    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 1; i < points.length; i++) {
            int x = Math.abs(points[i][0] - points[i - 1][0]);
            int y = Math.abs(points[i][1] - points[i - 1][1]);
            result += Math.max(x, y);
        }
        return result;
    }
}
