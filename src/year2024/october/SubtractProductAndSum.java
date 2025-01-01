package year2024.october;

public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int POD = 1;
        while (n > 0){
            int m = n % 10;
            sum += m % 10;
            POD *= m % 10;
            n /= 10;
        }
        return POD - sum;
    }
}
