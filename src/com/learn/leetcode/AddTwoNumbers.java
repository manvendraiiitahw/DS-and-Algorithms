package com.learn.leetcode;

import java.util.Scanner;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListNode listNode1 = new ListNode(9);
//        listNode1.next = new ListNode(4);
//        listNode1.next.next = new ListNode(3);
        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(9);
        listNode2.next.next = new ListNode(9);
        AddTwoNumbers.addTwoNumbers(listNode1, listNode2);
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0, carry=0;
        ListNode temp=null;
        ListNode listNode=null;
        while(l1!=null && l2!=null){
            sum=(l1.val+l2.val)+carry;
            carry=0;
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
            }
            if(temp==null){
                temp=new ListNode(sum);
                listNode=temp;
            }else{
                temp.next=new ListNode(sum);
                temp=temp.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while (l1!=null){
            sum=carry+l1.val;
            carry=0;
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
            }
            if(temp==null){
                temp=new ListNode(sum);
                listNode=temp;
            }else{
                temp.next=new ListNode(sum);
                temp=temp.next;
            }
            l1=l1.next;
        }

        while (l2!=null){
            sum=carry+l2.val;
            carry=0;
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
            }
            if(temp==null){
                temp=new ListNode(sum);
                listNode=temp;
            }else{
                temp.next=new ListNode(sum);
                temp=temp.next;
            }
            l2=l2.next;
        }
        if(carry>0){
            temp.next=new ListNode(carry);
        }
   return listNode;


//        ListNode revL1 = AddTwoNumbers.reverse(l1);
//        ListNode revL2 = AddTwoNumbers.reverse(l2);
//        int num = 0;
//        while (revL1 != null) {
//            num = num * 10 + revL1.val;
//            revL1 = revL1.next;
//        }
//        int num2 = 0;
//        while (revL2 != null) {
//            num2 = num2 * 10 + revL2.val;
//            revL2= revL2.next;
//        }
//        num=num+num2;
//        ListNode output=new ListNode();
//        ListNode temp1=output;
//        if(num==0){
//            return new ListNode(0);
//        }
//        while(num>0){
//            temp1.next=new ListNode(num%10);
//            temp1=temp1.next;
//            num=num/10;
//        }
//        output=output.next;
//        return output;
    }


    public static ListNode reverse(ListNode listNode) {
        ListNode prev = null;
        ListNode current = listNode;

        while (current != null) {
            current = current.next;
            listNode.next = prev;
            prev = listNode;
            listNode = current;
        }
        return prev;
    }
}


