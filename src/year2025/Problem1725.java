package year2025;

public class Problem1725 {

    public static void main(String[] args) {
        Problem1725 problem1725 = new Problem1725();
        System.out.println("problem1725.countGoodRectangles(new int[][]{{2,3},{3,7},{4,3},{3,7}}) = " + problem1725.countGoodRectangles(new int[][]{{2, 3}, {3, 7}, {4, 3}, {3, 7}}));
    }
    // https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/

    public int countGoodRectangles(int[][] rectangles) {
        int max = 0, index = 0;
        int[] squares = new int[rectangles.length];
        for (int[] rectangle : rectangles) {
            int min = Math.min(rectangle[0], rectangle[1]);
            squares[index++] = min;
            max = Math.max(max, min);
        }

        int count = 0;
        for (int square : squares) {
            if(max == square){
                count++;
            }
        }
        return count;
    }
}
