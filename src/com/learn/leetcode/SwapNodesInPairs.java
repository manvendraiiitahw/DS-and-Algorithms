package com.learn.leetcode;

public class SwapNodesInPairs {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(5);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next = new ListNode(2);
        listNode.next.next.next.next.next.next = new ListNode(2);
        System.out.println(swapPairs(listNode));
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode tmp = head.next;
        curr.next = tmp.next;
        tmp.next = curr;
        head=tmp;
        ListNode prev = curr;
        if (curr.next != null) {
            curr = curr.next;
        }
        tmp = curr.next;
        while (tmp != null) {
            curr.next = tmp.next;
            tmp.next = curr;
            prev.next = tmp;
            prev=curr;
            if (curr.next != null) {
                curr = curr.next;
            }
            tmp = curr.next;
        }
        return head;
    }
}
