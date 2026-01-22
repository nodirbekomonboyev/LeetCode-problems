package year2026;

public class Problem3668 {

    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ints = new int[101];
        for (int friend : friends) {
            ints[friend]++;
        }
        int index = 0;
        for (int i : order) {
            if(ints[i] > 0){
                friends[index++] = i;
            }
        }
        return friends;
    }
}
