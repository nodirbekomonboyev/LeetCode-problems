import arpil.*;
import may.CountBits;
import may.FindMaxK;
import may.IsAnagram;
import may.ReversePrefix;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CountBits countBits = new CountBits();
        System.out.println(Arrays.toString(countBits.countBits(100000)));
    }
}