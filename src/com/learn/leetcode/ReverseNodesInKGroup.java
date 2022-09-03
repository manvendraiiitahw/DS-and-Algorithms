package com.learn.leetcode;

import java.util.Collections;
import java.util.Stack;

public class ReverseNodesInKGroup {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(5);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(6);
//        listNode.next.next.next.next.next = new ListNode(2);
//        listNode.next.next.next.next.next.next = new ListNode(2);
        ListNode output = reverseKGroup(listNode, 3);
        while (output != null) {
            System.out.print(output.val + " ");
            output = output.next;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Stack<ListNode> listNodes = new Stack<>();
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {

            int i = 1;
            while (curr != null && i <= k) {
                listNodes.push(curr);
                curr = curr.next;
                i++;
            }
            if (listNodes.size() < k) {
                Collections.reverse(listNodes);
            }
            while (!listNodes.isEmpty()) {
                if (prev == null) {
                    prev = listNodes.pop();
                    head = prev;
                } else {
                    prev.next = listNodes.pop();
                    prev = prev.next;
                }
            }
        }
        assert prev != null;
        prev.next = null;
        return head;

    }
}
