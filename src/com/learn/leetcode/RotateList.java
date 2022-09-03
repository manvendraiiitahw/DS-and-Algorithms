package com.learn.leetcode;


public class RotateList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(3);
//        listNode.next.next.next = new ListNode(4);
//        listNode.next.next.next.next = new ListNode(5);
        RotateList rotateList = new RotateList();
        ListNode output = rotateList.rotateRight(listNode, 1);
        while (output != null) {
            System.out.println(output.val);
            output = output.next;
        }

    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int i = 1, len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        temp = head;
        if (k > len) {
            k = k % len;
        }
        if (k != 1 && len == k) {
            return head;
        }
        while (i < Math.abs(k - len)) {
            temp = temp.next;
            i++;
        }
        ListNode tempNext = temp.next;
        temp.next = null;
        temp = tempNext;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        if (temp == null) {
            return head;
        }
        temp.next = head;
        return tempNext;
    }
}
