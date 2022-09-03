package com.learn.leetcode;

import java.util.Objects;

public class PartitionList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
//        listNode.next.next.next = new ListNode(2);
//        listNode.next.next.next.next = new ListNode(5);
//        listNode.next.next.next.next.next = new ListNode(2);
        ListNode head = partitionList(listNode, 4);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode partitionList(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val >= x) {
                break;
            } else {
                temp = temp.next;
            }
        }
        int t = Math.max(temp.val, x);
        temp = head;
        ListNode smallerList = null;
        ListNode temp1 = null;

        boolean flag = true;
        while (temp != null) {
            if (temp.val < t && temp.val < x) {
                if (flag) {
                    temp1 = new ListNode(temp.val);
                    smallerList = temp1;
                    flag = false;
                } else {
                    temp1.next = new ListNode(temp.val);
                    temp1 = temp1.next;
                }
            }
            temp = temp.next;
        }
        ListNode largerList = null;
        ListNode temp2 = null;
        temp = head;
        flag = true;
        while (temp != null) {
            if (temp.val >= t || temp.val >= x) {
                if (flag) {
                    temp2 = new ListNode(temp.val);
                    largerList = temp2;
                    flag = false;
                } else {
                    temp2.next = new ListNode(temp.val);
                    temp2 = temp2.next;
                }
            }
            temp = temp.next;
        }
        if(Objects.nonNull(temp1)) {
            temp1.next = largerList;
            return smallerList;
        }else {
            return largerList;
        }
    }

}
