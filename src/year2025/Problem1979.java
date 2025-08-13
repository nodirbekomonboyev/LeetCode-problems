package year2025;

public class Problem1979 {

    //https://leetcode.com/problems/find-greatest-common-divisor-of-array/

    public int findGCD(int[] nums) {
        int max = nums[0], min = nums[0];
        for (int num : nums) {
            if(num > max){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }
        for (int i = min; i > 0; i--) {
            if(min % i == 0 && max % i == 0){
                return i;
            }
        }
        return 1;
    }

}
