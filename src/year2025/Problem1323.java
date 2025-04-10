package year2025;

public class Problem1323 {

    // https://leetcode.com/problems/maximum-69-number/

    public int maximum69Number (int num) {
        return Integer.parseInt((num + "").replaceFirst("6", "9"));
    }
}
