package year2024.arpil;

public class LargestSumAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int j = index(nums);
            nums[j] *= -1;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public int index(int[] nums){
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] > nums[j]) {
                i = j;
            }
        }
        return i;
    }
}
