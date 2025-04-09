package year2025;

public class Problem3340 {

    // https://leetcode.com/problems/check-balanced-string/

    public boolean isBalanced(String num) {
        int balance = 0;
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i % 2 == 0){
                balance -= chars[i] - '0';
            } else {
                balance += chars[i] - '0';
            }
        }
        return balance == 0;
    }
}
