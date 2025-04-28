package year2025;

public class Problem1534 {

    // https://leetcode.com/problems/count-good-triplets/

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(Math.abs(arr[i] - arr[j]) <= a){
                    for (int k = j + 1; k < arr.length; k++) {
                        if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[j]) <= c){
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }
}
