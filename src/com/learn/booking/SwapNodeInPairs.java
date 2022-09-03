package com.learn.booking;

import com.learn.ListNode;

public class SwapNodeInPairs {

  public static void main(String[] args){
    ListNode listNode=new ListNode(1);
    listNode.next=new ListNode(2);
    listNode.next.next=new ListNode(3);
    listNode.next.next.next=new ListNode(4);

    System.out.println(listNode.toString());
    if(listNode==null || listNode.next==null){
      System.out.println(listNode);
    }
    ListNode prev=listNode;
    ListNode curr=listNode.next;
    listNode=curr;

    while (true) {
      ListNode next = curr.next;
      curr.next = prev; // Change next of current as previous node

      // If next NULL or next is the last node
      if (next == null || next.next == null) {
        prev.next = next;
        break;
      }

      // Change next of previous to next next
      prev.next = next.next;

      // Update previous and curr
      prev = next;
      curr = prev.next;
    }


    System.out.println(listNode);

  }

}
