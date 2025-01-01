package year2024.november;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddTail = head;
        ListNode evenHead = head.next, evenTail = head.next;

        while (oddTail.next != null && evenTail.next != null) {
            oddTail.next = oddTail.next.next;
            evenTail.next = evenTail.next.next;
            oddTail = oddTail.next;
            evenTail = evenTail.next;
        }

        oddTail.next = evenHead;

        return head;
    }
}
//
//  ,,  node ,, node ,, node ,, node ,, node