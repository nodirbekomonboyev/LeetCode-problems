package year2025;

public class Problem1769 {

    // https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/

    public int[] minOperations(String boxes) {
        char[] toArray = boxes.toCharArray();
        int[] res = new int[boxes.length()];
        for (int i = 0; i < toArray.length; i++) {
            int calc = 0;
            for (int j = 0; j < toArray.length; j++) {
                if(toArray[j] == '1'){
                    calc += Math.abs(i - j);
                }
            }
            res[i] = calc;
        }
        return res;
    }
}
