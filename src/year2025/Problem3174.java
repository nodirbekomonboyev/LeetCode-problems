package year2025;

public class Problem3174 {

    // https://leetcode.com/problems/clear-digits/

    public String clearDigits(String s) {
        int charIndex = 0;

        StringBuilder sb = new StringBuilder(s);

        while (charIndex < sb.length()) {
            if (Character.isDigit(sb.charAt(charIndex))) {
                sb.deleteCharAt(charIndex);
                sb.deleteCharAt(charIndex - 1);
                charIndex--;
            } else {
                charIndex++;
            }
        }
        return sb.toString();
    }

}
