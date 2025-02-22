package year2025;

public class Problem476 {

    // https://leetcode.com/problems/number-complement/description

    public int findComplement(int num) {
        StringBuilder a = new StringBuilder(Integer.toBinaryString(num));
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == '0'){
                b.append("1");
            } else {
                b.append("0");
            }
        }
        return Integer.valueOf(b.toString(), 2);
    }
}
