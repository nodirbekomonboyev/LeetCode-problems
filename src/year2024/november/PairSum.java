package year2024.november;

import java.util.ArrayList;
import java.util.List;

public class PairSum {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        int max = 0;
        int n = list.size();
        for (int i = 0; i < n / 2 ; i++) {
            max = Math.max(max, list.get(i) + list.get(n - i - 1));
        }
        return max;
    }
}
