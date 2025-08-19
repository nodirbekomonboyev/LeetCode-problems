package year2025;

public class Problem2710 {
    // https://leetcode.com/problems/remove-trailing-zeros-from-a-string/

    public String removeTrailingZeros(String num) {
        char[] chars = num.toCharArray();
        int index = num.length();
        for (int i = chars.length - 1; i >= 0; i--) {
            if(chars[i] == '0'){
                index--;
            } else {
                break;
            }
        }
        return num.substring(0, index);
    }
}
