package year2026;

public class Problem3541 {

    public int maxFreqSum(String s) {
        String vowels = "aeiou";
        char[] chars = s.toCharArray();
        int[] vCount = new int[118];
        int[] count = new int[123];
        int vMax = 0;
        int max = 0;
        for (char c : chars) {
            if (vowels.indexOf(c) != -1) {
                vCount[c]++;
                vMax = Math.max(vMax, vCount[c]);
            } else {
                count[c]++;
                max = Math.max(max, count[c]);
            }
        }
        return max + vMax;
    }

}
