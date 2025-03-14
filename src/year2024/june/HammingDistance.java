package year2024.june;

public class HammingDistance {

    public int hammingDistance(final int x, final int y) {
        int xor = x ^ y, distance = 0;

        while(xor != 0) {
            if(xor % 2 == 1)
                distance++;
            xor = xor >> 1;
        }

        return distance;
    }
}
