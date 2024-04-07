package arpil;

public class ArraySign {
    public int arraySign(int[] nums) {
        int m = 1;
        for (int num : nums) {
            if(num == 0) {
                return 0;
            } else if (num < 0){
                m *= -1;
            }
        }
        return (m > 0)? 1 : -1;
    }

}

