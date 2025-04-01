package year2025;

public class Problem2315 {
    // https://leetcode.com/problems/count-asterisks/description/

    public int countAsterisks(String s) {
        int res = 0;
        int door = 1;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(c == '|'){
                door *= -1;
            } else if (c == '*') {
                if(door == 1){
                    res++;
                }
            }
        }
        return res;
    }
}
