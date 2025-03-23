package year2025;

import java.util.HashMap;
import java.util.Map;

public class Problem2325 {

    // https://leetcode.com/problems/decode-the-message/

    public String decodeMessage(String key, String message) {
        Map<Character, Character> keys = new HashMap<>();
        keys.put(' ', ' ');
        int ch = 'a';
        for (char c : key.toCharArray()) {
            if(!keys.containsKey(c)){
                keys.put(c, (char)(ch));
                ch++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : message.toCharArray()) {
            result.append(keys.get(c));
        }
        return result.toString();
    }
}
