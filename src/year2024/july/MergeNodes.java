package year2024.july;

import java.util.ArrayList;
import java.util.List;

public class MergeNodes {
    public ListNode mergeNodes(ListNode head) {
        List<Integer> l = new ArrayList<>();
        int sum = 0;
        head = head.next;
        while(head != null){
            sum += head.val;
            if(head.val == 0){
                l.add(sum);
                sum = 0;
            }
            head = head.next;
        }
        int size = l.size();
        if(size == 0){
            return new ListNode();
        }
        ListNode listNode = new ListNode(l.get(size - 1));
        for (int i = size - 2; i >= 0; i--) {
            listNode = new ListNode(l.get(i), listNode);
        }
        return listNode;
    }
}
