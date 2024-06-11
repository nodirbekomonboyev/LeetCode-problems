package june;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                ans[index] = num;
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(ans[i] != 0){
                nums[i] = ans[i];
            } else {
                nums[i] = 0;
            }
        }
    }
}
