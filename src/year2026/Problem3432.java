package year2026;

public class Problem3432 {

    public static void main(String[] args) {
        Problem3432 problem3432 = new Problem3432();
        problem3432.countPartitions(new int[]{10, 10, 3, 7, 6});
    }

    public int countPartitions(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            if(Math.abs(nums[i - 1] - sum) % 2 == 0){
                count++;
            }
            sum -= nums[i];
            nums[i] += nums[i-1];
        }
        return count;
    }

}
