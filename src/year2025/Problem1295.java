package year2025;

public class Problem1295 {

    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            int k = 0;
            while (num > 0){
                num /= 10;
                k++;
            }
            if(k % 2 == 0){
                result++;
            }
        }
        return result;
    }

}
