package year2025;

public class Problem1941 {

    public static void main(String[] args) {
        Problem1941 problem1941 = new Problem1941();
        System.out.println("problem1941.areOccurrencesEqual(\"aaabb\") = " + problem1941.areOccurrencesEqual("aabbzz"));
    }
    // https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/

    public boolean areOccurrencesEqual(String s) {
        char[] chars = s.toCharArray();
        int[] counts = new int[26];
        for (char c : chars) {
            counts[c - 'a']++;
        }
        int k = 0, i = 0;
        while (k == 0){
            if(counts[i] > 0){
                k = counts[i];
            } else {
                i++;
            }
        }
        for (int count : counts) {
            if (count != 0 && count != k) {
                return false;
            }
        }

        return true;
    }
}
