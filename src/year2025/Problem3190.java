package year2025;

public class Problem3190 {

    // https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/

    public int minimumOperations(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if(num % 3 != 0){
                result++;
            }
        }
        return result;
    }

}
