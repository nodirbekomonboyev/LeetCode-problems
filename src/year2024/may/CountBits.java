package year2024.may;

public class CountBits {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = count(Integer.toBinaryString(i));
        }
        return ans;
    }

    public int count(String n){
        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i) == '1') result++;
        }
        return result;
    }
}
