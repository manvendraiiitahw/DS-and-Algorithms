package coding.dcp.ms;


// { Driver Code Starts

import java.util.*;

class SingleLinkedList {
    int data;
    SingleLinkedList next;

    SingleLinkedList(int a) {
        data = a;
        next = null;
    }
}

public class UnionOfTwoLinkedLists {
    static Scanner sc = new Scanner(System.in);

    public static SingleLinkedList inputList(int size) {
        SingleLinkedList head, tail;
        int val;

        val = sc.nextInt();

        head = tail = new SingleLinkedList(val);

        size--;

        while (size-- > 0) {
            val = sc.nextInt();
            tail.next = new SingleLinkedList(val);
            tail = tail.next;
        }

        return head;
    }

    public static void printList(SingleLinkedList n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String args[]) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, m;

            n = sc.nextInt();
            SingleLinkedList head1 = inputList(n);

            m = sc.nextInt();
            SingleLinkedList head2 = inputList(m);

            Sol obj = new Sol();

            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}// } Driver Code Ends


/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol {
    public static SingleLinkedList findUnion(SingleLinkedList head1, SingleLinkedList head2) {
        HashSet<Integer> set = new HashSet<>();
        SingleLinkedList res = null;
        SingleLinkedList res1=null;
        while (head1 != null) {
            if (!set.contains(head1.data)) {
                set.add(head1.data);
                if (res == null) {
                    res = new SingleLinkedList(head1.data);
                    res1=res;
                } else {
                    res.next = new SingleLinkedList(head1.data);
                    res=res.next;
                }
            }
            head1 = head1.next;
        }
        while (head2 != null) {
            if (!set.contains(head2.data)) {
                set.add(head2.data);
                if (res == null) {
                    res = new SingleLinkedList(head2.data);
                    res1=res;
                } else {
                    res.next = new SingleLinkedList(head2.data);
                    res=res.next;
                }
            }
            head2 = head2.next;
        }
        return mergeSort1(res1);

    }

    static SingleLinkedList findMiddle(SingleLinkedList head) {
        if (head == null) {
            return head;
        }
        SingleLinkedList slow = head;
        SingleLinkedList fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static SingleLinkedList mergeSort1(SingleLinkedList head) {
        if (head == null || head.next == null) {
            return head;
        }
        //find the middle of linkedlist
        SingleLinkedList middle = findMiddle(head);
        SingleLinkedList middleNext = middle.next;
        middle.next = null; //Break list into two part
        SingleLinkedList left = mergeSort1(head);
        SingleLinkedList right = mergeSort1(middleNext);
        SingleLinkedList n = sortedMerge(left, right);
        return n;

    }

    static SingleLinkedList sortedMerge(SingleLinkedList a, SingleLinkedList b) {
        SingleLinkedList result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;

        /* Pick either a or b, and recur */
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

}