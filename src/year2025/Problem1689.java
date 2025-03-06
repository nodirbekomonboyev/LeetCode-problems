package year2025;

public class Problem1689 {

    // https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/


    /** way one */
//    public int minPartitions(String n) {
//        int result = 0;
//        char[] toArray = n.toCharArray();
//        for (char c : toArray) {
//            result = Math.max(result, c - '0');
//            if(result == 9){
//                return 9;
//            }
//        }
//        return result;
//    }

    /** way two */
    public int minPartitions(String n) {
        for (int i = 9; i >= 1; --i) {
            if (n.contains(String.valueOf(i))) {
                return i;
            }
        }
        return 0;
    }
}
