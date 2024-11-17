package november;

public class Rob {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }

        return dp[n - 1];
    }

    /*
    *
    * DP(0) = M(0);
    * DP(1) = max(M(0), M(1))
    * DP(2) = max(M(2) + DP(0), DP(1));
    * DP(k) = max(M(k) + DP(k - 2), DP(k - 1));
    *
    *
    * */
}
