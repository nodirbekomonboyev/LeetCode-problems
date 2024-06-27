package june;

import java.util.Arrays;

public class MinimumAverage {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        double ans = Double.MAX_VALUE;
        for (int i = 0; i < size / 2 ; i++) {
            ans = Double.min(ans, (nums[i] + nums[size - i - 1]) / 2D);
        }
        return ans;
    }
}
