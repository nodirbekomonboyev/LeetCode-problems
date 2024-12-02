package november;

public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int start = 0;
        double max = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[start++] + nums[i];
            max = Math.max(sum, max);
        }
        return max / k;
    }
}
