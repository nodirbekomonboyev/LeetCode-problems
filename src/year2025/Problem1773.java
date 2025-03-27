package year2025;

import java.util.List;

public class Problem1773 {

    // https://leetcode.com/problems/count-items-matching-a-rule/

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        int result= 0;
        switch (ruleKey) {
            case "type" -> {}
            case "color" -> index = 1;
            case "name" -> index = 2;
        }
        for (List<String> item : items) {
            if(item.get(index).equals(ruleValue)){
                result++;
            }
        }
        return result;
    }
}
