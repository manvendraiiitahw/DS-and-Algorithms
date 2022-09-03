package advance.java.leetcode.subscription.neetcode.linkedlist;

import advance.java.leetcode.ListNode;

//143
public class ReorderList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next=new ListNode(9);
        ReorderList reorderList = new ReorderList();
        reorderList.reorderList(listNode);
        while (listNode != null) {
            System.out.print(listNode.val);
            System.out.println();
            listNode = listNode.next;
        }
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        } else {
            ListNode slowPtr = head, fastPtr = head;
            while (fastPtr.next != null && fastPtr.next.next != null) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;
            }
            fastPtr = slowPtr.next;
            fastPtr=reverse(fastPtr);
            slowPtr.next = null;
            slowPtr = head;
            while (fastPtr != null) {
                ListNode temp = fastPtr;
                fastPtr = fastPtr.next;
                temp.next = slowPtr.next;
                slowPtr.next = temp;
                slowPtr = temp.next;
            }
        }
    }

    public ListNode reverse(ListNode listNode) {
        if (listNode == null || listNode.next == null) {
            return listNode;
        }
        ListNode newNode = reverse(listNode.next);
        listNode.next.next = listNode;
        listNode.next = null;
        return newNode;
    }
}
