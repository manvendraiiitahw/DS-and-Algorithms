package advance.java.leetcode.subscription.backtrack;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode h = reverseList(head);
        while (h != null) {
            System.out.print(h.val +" ->");
            h = h.next;
        }
        System.out.println("null");
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next==null) {
            return head;
        }
        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}
