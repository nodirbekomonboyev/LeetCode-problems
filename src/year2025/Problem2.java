package year2025;

import java.util.ArrayList;

public class Problem2 {

    // https://leetcode.com/problems/add-two-numbers/description

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list = new ArrayList<>();
        int x = 0;
        while (l1 != null || l2 != null || x > 0){
            int val1 = (l1 != null)? l1.val : 0;
            int val2 = (l2 != null)? l2.val : 0;
            list.add((val1 + val2 + x) % 10);
            x = (val1 + val2 + x) / 10;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }

        ListNode listNode = null;
        for (int i = list.size() - 1; i >= 0 ; i--) {
            listNode = new ListNode(list.get(i), listNode);
        }
        return listNode;
    }

}
