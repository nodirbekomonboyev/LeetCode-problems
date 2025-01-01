package year2024.november;

import java.util.ArrayDeque;
import java.util.Queue;

public class PredictPartyVictory {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new ArrayDeque<>();
        Queue<Integer> dire = new ArrayDeque<>();
        char[] chars = senate.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'R'){
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }
        int i = senate.length();
        while (!radiant.isEmpty() && !dire.isEmpty()){
            if(radiant.peek() < dire.peek()){
                radiant.add(i++);
            } else {
                dire.add(i++);
            }
            radiant.poll();
            dire.poll();
        }
        return (radiant.isEmpty()) ? "Dire" : "Radiant";
    }
}

/*
* DRRDRDRDRDDRDRDR
* RRDRDRDRDDRDRDd
* RDRDRDRDDRDRDr
* DRDRDRDDRDRrr
* RDRDRDDRDRrd
* DRDRDDRDRrr
* RDRDDRDRrd
* DRDDRDRrr
* RDDRDRrd
* DDRDRrr
* DRDRrd
* RDRdd
* DRdr
* Rdd
* dr
* d
* */

/*
* DRRDRDRDRDDRDRDR
* DxRxRxRxRxDxDxDx
* DxxxRxRxRxxxDxDx
* DxxxxxRxRxxxxxDx
* DxxxxxxxRxxxxxxx
* xxxxxxxxRxxxxxxx
*
* */
