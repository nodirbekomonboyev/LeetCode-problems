package year2024.september;

public class LargestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int altitude = 0;
        for (int i : gain) {
            altitude += i;
            max = Math.max(altitude, max);
        }
        return max;
    }
}
