package year2026;

public class Problem3010 {

    public int minimumCost(int[] nums) {
        int arr2 = nums[1], arr3 = nums[2];
        int sum = 101;
        for (int i = 1; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int subSum = nums[i] + nums[j];
                if(subSum < sum){
                    sum = subSum;
                    arr2 = nums[i];
                    arr3 = nums[j];
                }
            }
        }
        return nums[0] + arr2 + arr3;
    }

}
