package year2025;

public class Problem1332 {
    // https://leetcode.com/problems/remove-palindromic-subsequences/description/

    public int removePalindromeSub(String s) {
        return (s.equals(new StringBuilder(s).reverse().toString()))? 1 : 2;
    }
}
