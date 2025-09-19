package year2025;

import java.util.*;

public class Problem682 {
    public static void main(String[] args) {
        Problem682 problem682 = new Problem682();
        problem682.calPoints(new String[]{"5","2","C","D","+"});
    }
    // https://leetcode.com/problems/baseball-game/

    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for (String o : operations) {
            switch (o) {
                case "+" -> {
                    int l = list.size();
                    list.add(list.get(l - 1) + list.get(l - 2));
                }
                case "D" -> {
                    int l = list.size();
                    list.add(list.get(l - 1) * 2);
                }
                case "C" -> {
                    list.remove(list.size() - 1);
                }
                default -> list.add(Integer.parseInt(o));
            }
        }
        int result = 0;
        for (Integer i : list) {
            result += i;
        }
        return result;
    }
}
