package year2025;

public class Problem1221 {

    // https://leetcode.com/problems/split-a-string-in-balanced-strings/

    public int balancedStringSplit(String s) {
        int balance = 0;
        int result = 0;
        for (char c : s.toCharArray()) {
            if(c == 'R'){
                balance++;
            } else {
                balance--;
            }

            if(balance == 0){
                result++;
            }
        }
        return result;
    }
}
