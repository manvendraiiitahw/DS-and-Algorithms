package advance.java.leetcode;

public class SumOfTwoLinkedListNumbers {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(6);
        head1.next.next = new ListNode(3);

        ListNode head2 = new ListNode(8);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(2);
//        head2.next.next.next=new ListNode(9);
        head1 = reverse(head1);
        head2 = reverse(head2);
        ListNode out = sum(head1, head2);
        out = reverse(out);
        while (out != null) {
            System.out.println(out.val);
            out = out.next;
        }
    }

    public static ListNode sum(ListNode head1, ListNode head2) {
        ListNode res = null;
        ListNode temp = null;
        int carry = 0;
        while (head1 != null && head2 != null) {
            int sum = carry + head1.val + head2.val;
            carry = sum / 10;
            sum = sum % 10;
            if (res == null) {
                res = new ListNode(sum);
                temp = res;
            } else {
                temp.next = new ListNode(sum);
                temp = temp.next;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        while (head1 != null) {
            int sum = carry + head1.val;
            carry = sum / 10;
            sum = sum % 10;
            if (res == null) {
                res = new ListNode(sum);
                temp = res;
            } else {
                temp.next = new ListNode(sum);
                temp = temp.next;
            }
            head1 = head1.next;
        }

        while (head2 != null) {
            int sum = carry + head2.val;
            carry = sum / 10;
            sum = sum % 10;
            if (res == null) {
                res = new ListNode(sum);
                temp = res;
            } else {
                temp.next = new ListNode(sum);
                temp = temp.next;
            }
            head2 = head2.next;
        }
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }
        return res;

    }


    public static ListNode reverse(ListNode listNode) {
        ListNode temp = null;
        ListNode curr = listNode;
        while (curr != null) {
            listNode = curr.next;
            curr.next = temp;
            temp = curr;
            curr = listNode;
        }
        return temp;

    }
}
