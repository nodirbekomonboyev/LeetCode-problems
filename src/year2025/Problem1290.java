package year2025;

public class Problem1290 {

    // https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/


    public int getDecimalValue(ListNode head) {
        StringBuilder binary = new StringBuilder();
        while (head != null){
            binary.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(String.valueOf(binary), 2);
    }

}
