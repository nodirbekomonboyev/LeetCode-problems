package year2025;

import java.util.HashSet;
import java.util.Set;

public class Problem2716 {
    // https://leetcode.com/problems/minimize-string-length/

    public int minimizedStringLength(String s) {
        char[] chars = s.toCharArray();
        Set<Character> sets = new HashSet<>();
        for (char c : chars) {
            sets.add(c);
        }
        return sets.size();
    }
}
