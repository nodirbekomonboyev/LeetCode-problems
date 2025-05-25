package year2025;

public class Problem3019 {

    public static void main(String[] args) {
        Problem3019 problem3019 = new Problem3019();
        System.out.println("problem3019.countKeyChanges(\"aaBbcC\") = " + problem3019.countKeyChanges("aaBbcC"));
    }

    // https://leetcode.com/problems/number-of-changing-keys/

    public int countKeyChanges(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 1; i < chars.length; i++) {
            int df = chars[i] - chars[i - 1];
            if(df != 0 && df != 32 && df != -32){
                result++;
            }
        }
        return result;
    }
}
