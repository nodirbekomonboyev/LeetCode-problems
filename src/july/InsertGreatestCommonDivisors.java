package july;

public class InsertGreatestCommonDivisors {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        ListNode prev = head;
        if(head == null || head.next == null){
            return head;
        }
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
            ListNode newNode = new ListNode(greatestCMD(prev.val, temp.val));
            prev.next = newNode;
            newNode.next = temp;
        }
        return head;
    }

    private int greatestCMD(int a,int b){
        if(a == 0) return b;
        return greatestCMD(b % a, a);
    }
}
