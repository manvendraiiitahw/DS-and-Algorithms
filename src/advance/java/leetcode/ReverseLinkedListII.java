package advance.java.leetcode;

import java.util.Stack;

//Given the head of a singly linked list and two integers left and right where left <= right,
// reverse the nodes of the list from position left to position right, and return the reversed list.
public class ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
//        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(4);
//        node.next.next.next.next = new ListNode(5);
        ListNode root = reverseBetween(node, 1, 2);
        while (root != null) {
            System.out.println(root.val);
            root = root.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }
        if (m == n || m > n) {
            return head;
        }
        Stack<ListNode> listNodes = new Stack<>();
        ListNode temp = head;
        int i = 1;
        while (i <= n && temp != null) {
            if (i < m) {
                temp = temp.next;
            } else {
                listNodes.push(temp);
                temp = temp.next;
            }
            i++;
        }
        ListNode tail = temp;
        temp = head;
        i = 1;
        while (i < m-1) {
            temp = temp.next;
            i++;
        }
        while (!listNodes.isEmpty()) {
            temp.next = listNodes.pop();
            temp = temp.next;
        }
        temp.next = tail;

        return head;
    }
}
