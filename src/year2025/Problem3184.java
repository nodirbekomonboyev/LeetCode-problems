package year2025;

public class Problem3184 {
    // https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/

    public static void main(String[] args) {
        Problem3184 problem3184 = new Problem3184();
        System.out.println("problem3184.countCompleteDayPairs(new int[]{12,12,30,24,24}) = " + problem3184.countCompleteDayPairs(new int[]{12, 12, 30, 24, 24}));
    }
    public int countCompleteDayPairs(int[] hours) {
        int result = 0;
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if((hours[i] + hours[j]) % 24 == 0){
                    result++;
                }
            }
        }
        return result;
    }
}
