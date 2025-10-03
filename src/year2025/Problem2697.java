package year2025;

import java.util.Arrays;

public class Problem2697 {
    // https://leetcode.com/problems/lexicographically-smallest-palindrome/

    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if(chars[i] != chars[l - i - 1]){
                if(chars[i] - chars[l - i -1] < 0){
                    chars[l - i - 1] = chars[i];
                } else {
                    chars[i] = chars[l - i - 1];
                }
            }
        }

        return new String(chars);
    }
}
