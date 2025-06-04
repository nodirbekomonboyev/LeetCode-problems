package year2025;

import java.util.Arrays;

public class Problem2657 {
    public static void main(String[] args) {
        Problem2657 problem2657 = new Problem2657();
        System.out.println("problem2657.findThePrefixCommonArray(new int[]{3,1,2,4}, new int[]{1,3,2,4}) = " + Arrays.toString(problem2657.findThePrefixCommonArray(new int[]{3, 1, 2, 4}, new int[]{1, 3, 2, 4})));
    }

    // https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int lenght= A.length;
        int[] result = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            int count = 0;
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k <= i; k++) {
                    if(A[j] == B[k]){
                        count++;
                    }
                }
            }
            result[i] = count;
        }
        return result;
    }

}
