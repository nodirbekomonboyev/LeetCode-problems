package year2025;

import java.util.HashSet;
import java.util.Set;

public class Problem804 {

    // https://leetcode.com/problems/unique-morse-code-words/

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> trs = new HashSet<>();
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String word : words) {
            char[] chars = word.toCharArray();
            StringBuilder str = new StringBuilder();
            for (char c : chars) {
                str.append(morse[c - 'a']);
            }
            trs.add(str.toString());
        }
        return trs.size();
    }
}
