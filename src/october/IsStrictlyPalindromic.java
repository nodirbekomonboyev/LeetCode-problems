package october;

public class IsStrictlyPalindromic {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            StringBuilder x = new StringBuilder(Integer.toString(n, i));
            StringBuilder xReverse = new StringBuilder(Integer.toString(n, i)).reverse();
            if(!x.toString().equals(xReverse.toString())){
                return false;
            }
        }
        return true;
    }
}
