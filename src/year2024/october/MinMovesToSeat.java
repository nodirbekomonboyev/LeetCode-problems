package year2024.october;

import java.util.Arrays;

public class MinMovesToSeat {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans=0;
        for(int i=0;i<seats.length;i++){
            ans+=Math.abs(students[i]-seats[i]);
        }
        return ans;
    }
}
