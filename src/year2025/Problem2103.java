package year2025;

import java.util.HashMap;
import java.util.Map;

public class Problem2103 {

    // https://leetcode.com/problems/rings-and-rods/

    public int countPoints(String rings) {
        int length = rings.length();
        if(length < 5){
            return 0;
        }
        char[] chars = rings.toCharArray();
        Map<Character, StringBuilder> rots = new HashMap<>();
        for (int i = 1; i < length; i += 2) {
            char c = chars[i];
            if(rots.containsKey(c)){
                rots.replace(c, rots.get(c).append(chars[i - 1]));
            } else {
                rots.put(c, new StringBuilder(chars[i - 1] + ""));
            }
        }

        int result = 0;
        for (StringBuilder value : rots.values()) {
            if(value.indexOf("R") != -1 && value.indexOf("G") != -1 && value.indexOf("B") != -1){
                result++;
            }
        }
        return result;
    }
}
