package advance.java.leetcode.subscription.neetcode.linkedlist;

import advance.java.leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseNodesInkGroup {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(5);
        listNode.next.next.next = new ListNode(6);
        listNode.next.next.next.next = new ListNode(7);
        listNode.next.next.next.next.next = new ListNode(8);
        listNode.next.next.next.next.next.next = new ListNode(9);
        listNode.next.next.next.next.next.next.next = new ListNode(10);
//        listNode.next.next.next.next.next.next.next.next = new ListNode(11);
        ReverseNodesInkGroup reverseNodesInkGroup = new ReverseNodesInkGroup();
//        listNode=reverseNodesInkGroup.reverse(listNode);
        listNode = reverseNodesInkGroup.reverseKGroup(listNode, 3);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        List<ListNode> listNodes = new ArrayList<>();
        ListNode temp = head;
        int i = 1;
        boolean allReverseRequired = true;
        int n = 1;
        while (temp != null) {
            i = 1;
            head = temp;
            while (i < k && temp != null) {
                temp = temp.next;
                i++;
                n++;
            }
            ListNode newHead = null;
            if (temp != null) {
                newHead = temp.next;
                temp.next = null;
                n++;
            }
            listNodes.add(head);
            temp = newHead;
        }
        n--;
        if (n % k != 0) {
            allReverseRequired = false;
        }
        List<ListNode> listNodesNew = new ArrayList<>();
        int len = allReverseRequired ? listNodes.size() : listNodes.size() - 1;
        for (int j = 0; j < len; j++) {
            ListNode node = reverse(listNodes.get(j));
            listNodesNew.add(node);
        }
        if (len != listNodes.size()) {
            listNodesNew.add(listNodes.get(listNodes.size() - 1));
        }
        ListNode newHead = listNodesNew.get(0);
        temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        for (int j = 1; j < listNodesNew.size(); j++) {
            temp.next = listNodesNew.get(j);
            while (temp.next != null) {
                temp = temp.next;
            }
        }

        return newHead;
    }

    public ListNode reverse(ListNode listNode) {
        if (listNode == null || listNode.next == null) {
            return listNode;
        }
        ListNode cur = reverse(listNode.next);
        listNode.next.next = listNode;
        listNode.next = null;
        return cur;

    }
}
