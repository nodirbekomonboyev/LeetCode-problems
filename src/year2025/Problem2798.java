package year2025;

public class Problem2798 {

    // https://leetcode.com/problems/number-of-employees-who-met-the-target/

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result = 0;
        for (int hour : hours) {
            if(hour >= target){
                result++;
            }
        }
        return result;
    }
}
