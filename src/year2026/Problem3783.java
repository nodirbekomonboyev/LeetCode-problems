package year2026;

public class Problem3783 {

    public int mirrorDistance(int n) {
        int temp = n;
        int reverse = 0;
        while (temp > 0){
            reverse *= 10;
            reverse += temp % 10;
            temp /= 10;
        }
        return Math.abs(n - reverse);
    }

}
