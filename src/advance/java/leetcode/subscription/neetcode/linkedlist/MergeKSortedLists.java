package advance.java.leetcode.subscription.neetcode.linkedlist;

import advance.java.leetcode.ListNode;

public class MergeKSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode out = mergeKSortedLists.merge(l1, l2);
        while (out != null) {
            System.out.println(out.val);
            out = out.next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length < 1) {
            return null;
        }
        if (lists.length < 2) {
            return lists[0];
        }
        ListNode res = merge(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            res = merge(res, lists[i]);
        }
        return res;
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}
