package year2025;

public class Problem2545 {
    public static void main(String[] args) {
        Problem2545 problem2545 = new Problem2545();
        problem2545.sortTheStudents(new int[][]{{10,6,9,1},{7,5,11,2},{4,8,3,15}}, 2);
    }
    // https://leetcode.com/problems/sort-the-students-by-their-kth-score/

    public int[][] sortTheStudents(int[][] score, int k) {
        int leng = score.length;
        int[][] res = new int[leng][score[0].length];
        boolean[] indexes = new boolean[leng];
        for (int i = 0; i < leng; i++) {
            int max = -1;
            int ind = 0;
            for (int j = 0; j < leng; j++) {
                    if(!indexes[j] && max < score[j][k]){
                        max = score[j][k];
                        ind = j;
                    }
            }
            indexes[ind] = true;
            res[i] = score[ind];
        }
        return res;
    }
}
