package year2025;

import java.util.*;

public class Problem3602 {
    // https://leetcode.com/problems/hexadecimal-and-hexatrigesimal-conversion/

    public String concatHex36(int n) {
        long n2 = (long) n * n;
        long n3 = n * n2;

        StringBuilder hexPart = new StringBuilder(Long.toHexString(n2).toUpperCase());

        StringBuilder hexTriPart = new StringBuilder();
        while(n3 > 0){
            long remain = n3 % 36;
            char c;
            if(remain < 10){
                c = (char)('0' + remain);
            } else {
                c = (char)('A' + remain - 10);
            }
            hexTriPart.append(c);
            n3 /= 36;
        }
        return hexPart.append(hexTriPart.reverse()).toString();
    }
    /**
     * F4240GJDGXS
     * 983,040 + 16384 + 512 +
     *
     * n = 1000
     *
     * n2 = 1,000,000;
     * n2 = (15 * 16^4) + (4 * 16^3) + (2 * 16^2) + (4 * 16)
     *
     * */
}
