package year2024.november;

import java.util.Stack;

public class RemoveStars {
    public String removeStars(String s) {
        Stack<Character> chars = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '*'){
                chars.pop();
            } else {
                chars.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (Character c : chars) {
            ans.append(c);
        }
        return ans.toString();
    }
}
