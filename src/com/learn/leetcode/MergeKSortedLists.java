package com.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortedLists {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);

        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(3);
        listNode1.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(5);
        listNode2.next.next = new ListNode(8);

        ListNode listNode3 = new ListNode(2);
        listNode3.next = new ListNode(3);
        listNode3.next.next = new ListNode(7);

        ListNode[] listNodes = {listNode, listNode1, listNode2, listNode3};
        System.out.println(mergeKLists(listNodes));
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode output = mergeTwoLists(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            output = mergeTwoLists(output, lists[i]);
        }
        return output;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode res = null;
        ListNode tmp = null;
        boolean isFirstTime = true;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                if (isFirstTime) {
                    res = new ListNode(l1.val);
                    tmp = res;
                    isFirstTime = false;
                } else {
                    res.next = new ListNode(l1.val);
                    res = res.next;
                }
                l1 = l1.next;
            } else {
                if (isFirstTime) {
                    res = new ListNode(l2.val);
                    tmp = res;
                    isFirstTime = false;
                } else {
                    res.next = new ListNode(l2.val);
                    res = res.next;
                }
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            res.next = new ListNode(l1.val);
            res = res.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            res.next = new ListNode(l2.val);
            res = res.next;
            l2 = l2.next;
        }
        return tmp;
    }
}
