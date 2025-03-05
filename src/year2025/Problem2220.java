package year2025;

public class Problem2220 {

    public static void main(String[] args) {
        String s = Integer.toBinaryString(7);
        System.out.println("s = " + s);
    }

    // https://leetcode.com/problems/minimum-bit-flips-to-convert-number/

    public int minBitFlips(int start, int goal) {
        StringBuilder binaryStart = new StringBuilder(Integer.toBinaryString(start)).reverse();
        StringBuilder binaryGoal = new StringBuilder(Integer.toBinaryString(goal)).reverse();
        int startLength = binaryStart.length(), goalLength = binaryGoal.length();
        int loop = Math.max(goalLength, startLength);
        int res = 0;
        for (int i = 0; i < loop; i++) {
            if (i < startLength && i < goalLength){
                if(binaryGoal.charAt(i) != binaryStart.charAt(i)){
                    res++;
                }
            } else if(i < startLength) {
                if(binaryStart.charAt(i) == '1'){
                    res++;
                }
            } else {
                if(binaryGoal.charAt(i) == '1'){
                    res++;
                }
            }
        }
        return res;
    }
}
