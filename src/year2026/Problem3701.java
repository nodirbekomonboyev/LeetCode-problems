package year2026;

public class Problem3701 {
    public int alternatingSum(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++){
            if(i % 2 != 0){
                nums[0] -= nums[i];
            } else {
                nums[0] += nums[i];
            }
        }
        return nums[0];
    }
}
