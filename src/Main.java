import arpil.*;
import june.HammingDistance;
import june.IslandPerimeter;
import may.CountBits;
import may.FindMaxK;
import may.IsAnagram;
import may.ReversePrefix;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IslandPerimeter islandPerimeter = new IslandPerimeter();
        System.out.println(islandPerimeter
                .islandPerimeter(new int[][]{{0, 1, 0, 0}}));
    }
}