package year2025;

import java.util.Arrays;

public class Problem832 {
    public static void main(String[] args) {
        Problem832 problem832 = new Problem832();
        System.out.println("problem832.flipAndInvertImage(new int[][]{{1,1,0,0},{0,0,0,0},{0,1,1,1},{1,0,1,0}}) = " + Arrays.deepToString(problem832.flipAndInvertImage(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}})));
    }

    // https://leetcode.com/problems/flipping-an-image/

    public int[][] flipAndInvertImage(int[][] image) {
        int length = image.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= (length - 1) / 2; j++) {
                int temp = image[i][j];
                image[i][j] = Math.abs(image[i][length - 1 - j] - 1);
                image[i][length - 1 - j] = Math.abs(temp - 1);
            }
        }
        return image;
    }

}
