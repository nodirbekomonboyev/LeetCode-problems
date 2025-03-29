package year2025;

public class Problem1844 {

    // https://leetcode.com/problems/replace-all-digits-with-characters/

    public String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        char lastChar = 0;
        StringBuilder res = new StringBuilder();
        for (char c : chars) {
            if('a' <= c && c <= 'z'){
                lastChar = c;
                res.append(c);
            } else {
                res.append((char) (lastChar + c - '0'));
            }
        }
        return res.toString();
    }
}
