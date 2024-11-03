package october;

import java.util.Arrays;

public class MaxWidthOfVerticalArea {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] list = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            list[i] = points[i][0];
        }
        Arrays.sort(list);
        int max = 0;
        for (int i = 1; i < list.length; i++) {
            int dif = list[i] - list[i - 1];
            max = Math.max(max, dif);
        }
        return max;
    }
}
