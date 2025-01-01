package year2024.november;

import java.util.Arrays;

public class CloseStrings {
    public boolean closeStrings(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        if (length1 != length2) {
            return false;
        }
        byte[] bytes1 = word1.getBytes();
        byte[] bytes2 = word2.getBytes();
        int[] chars1 = new int[26];
        int[] chars2 = new int[26];

        point(bytes1, chars1, length1);
        point(bytes2, chars2, length2);

        for (int i = 0; i < 26; i++){
            if (chars1[i] > 0 ^ chars2[i] > 0) {
                return false;
            }
        }
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
    void point(byte[] bytes, int[] i, int length) {
        while (length-- > 0)
            i[bytes[length] - 97]++;
    }
}
