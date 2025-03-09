package year2025;

public class Problem1684 {

    // https://leetcode.com/problems/count-the-number-of-consistent-strings/description/

    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] map = new boolean[26];
        int res = words.length;

        for (char c : allowed.toCharArray()) {
            map[c - 'a'] = true;
        }

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if(!map[c - 'a']){
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}
