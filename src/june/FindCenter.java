package june;

public class FindCenter {

    public int findCenter(int[][] edges) {
        int[] point = new int[edges.length + 1];
        for (int[] edge : edges) {
            for (int i : edge) {
                point[i - 1]++;
                if(point[i - 1] > 1){
                    return i;
                }
            }
        }
        return 0;
    }
}
