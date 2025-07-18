package year2025;

public class Problem3304 {
    // https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/

    public char kthCharacter(int k) {
        int count = Integer.bitCount(k - 1);
        return (char) ('a' + count);
    }

}
