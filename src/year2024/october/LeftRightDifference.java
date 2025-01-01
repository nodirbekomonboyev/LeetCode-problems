package year2024.october;

public class LeftRightDifference {
    public int[] leftRightDifference(int[] nums) {
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
        int leftSum = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return ans;
    }
}
