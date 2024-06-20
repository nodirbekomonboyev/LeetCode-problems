package june;

public class HammingWeight {

    public int hammingWeight(int n) {
        String num = Integer.toBinaryString(n);
        int ans = 0;
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '1'){
                ans++;
            }
        }
        return ans;
    }
}
