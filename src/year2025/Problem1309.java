package year2025;

public class Problem1309 {
    // https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/

    public static void main(String[] args) {
        Problem1309 problem1309 = new Problem1309();
        System.out.println("problem1309.freqAlphabets(\"10#11#12\") = " + problem1309.freqAlphabets("10#11#12"));
    }
    public String freqAlphabets(String s) {
        StringBuilder nums = new StringBuilder("");
        char[] chars = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            int number;
            if(chars[i] == '#'){
                number = Integer.parseInt(s.substring(i - 2, i));
                i -= 2;
            } else {
                number = Integer.parseInt(String.valueOf(s.charAt(i)));

            }
            nums.append((char)(number + 96));
        }
        return nums.reverse().toString();
    }
}
