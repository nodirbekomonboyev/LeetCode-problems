package november;

public class LongestOnes {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int result = 0;
        int zeroes = 0;
        for (int right = 0; right < nums.length; right++) {
            if(nums[right] == 0){
                zeroes++;
                while(zeroes > k){
                    int i = nums[left++];
                    if(i == 0){
                        zeroes--;
                    }
                }
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
