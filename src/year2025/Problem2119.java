package year2025;

public class Problem2119 {

    public static void main(String[] args) {
        Problem2119 problem2119 = new Problem2119();
        System.out.println("problem2119.isSameAfterReversals(526) = " + problem2119.isSameAfterReversals(526));
    }

    // https://leetcode.com/problems/a-number-after-a-double-reversal/

    public boolean isSameAfterReversals(int num) {
        if(num == 0){
            return true;
        }
        return num % 10 != 0;
    }
}
