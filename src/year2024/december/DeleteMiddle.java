package year2024.december;

public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        ListNode prevMiddle = null;
        ListNode temp2 = head;
        int i = 0;
        int mid = length / 2;
        while (temp2 != null) {
            if (i == mid) {
                prevMiddle.next = temp2.next;
                i++;
            } else {
                prevMiddle = temp2;
                temp2 = temp2.next;
                i++;
            }
        }

        return head;
    }
}
