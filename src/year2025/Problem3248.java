package year2025;

import java.util.*;

public class Problem3248 {

    // https://leetcode.com/problems/snake-in-matrix/

    public int finalPositionOfSnake(int n, List<String> commands) {
        int index = 0;
        for (String command : commands) {
            switch (command) {
                case "RIGHT" -> index++;
                case "LEFT" -> index--;
                case "DOWN" -> index += n;
                default -> index -= n;
            }
        }
        return index;
    }

}
