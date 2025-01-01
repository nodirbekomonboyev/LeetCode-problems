package year2024.july;

public class FindPermutationDifference {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += Math.abs(i - t.indexOf(s.charAt(i)));
        }
        return ans;
    }
}
