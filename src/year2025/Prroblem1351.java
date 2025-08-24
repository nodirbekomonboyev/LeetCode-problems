package year2025;

public class Prroblem1351 {

    //https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

    public int countNegatives(int[][] grid) {
        int result = 0;
        for (int[] ints : grid) {
            for (int i : ints) {
                if(i < 0){
                    result++;
                }
            }
        }
        return result;
    }

}
