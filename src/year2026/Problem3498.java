package year2026;

public class Problem3498 {

    public int reverseDegree(String s) {
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; ) {
            sum += ((26 - (chars[i] - 'a')) * ++i);
        }
        return sum;
    }

}
