package june;

public class TitleToNumber {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int power = 0;
        int size = columnTitle.length();
        for(int i = size - 1; i >= 0 ; i--){
            int mod = columnTitle.charAt(i) - 64;
            ans += Math.pow(26, power++) * mod;
        }
        return ans;
    }
}
