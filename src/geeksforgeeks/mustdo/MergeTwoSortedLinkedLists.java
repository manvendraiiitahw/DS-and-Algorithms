package geeksforgeeks.mustdo;

import java.util.Stack;

class Node {
    int data;
    Node next;
    Node bottom;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class MergeTwoSortedLinkedLists {

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next.next = new Node(8);
//        head1.next.next.next.next=head1.next;
        Node head2 = new Node(8);
        head2.next = new Node(9);
        head2.next.next = head1.next.next;
//        head2.next.next = new Node(20);
//        Node output = MergeTwoSortedLinkedLists.sortedMerge(head1, head2);
//        Node output = reverseList(head1);
//        removeLoop(head1);
//        while (output != null) {
//            System.out.print(output.data + " ");
//            output = output.next;
//        }
//        System.out.println(MergeTwoSortedLinkedLists.intersectPoint(head1, head2));
//        MergeTwoSortedLinkedLists.rotate(head1, 4);
        Node out = MergeTwoSortedLinkedLists.reverse(head1, 4);
        System.out.println(out);
    }

    public static Node reverse(Node node, int k) {
        if (node == null || node.next == null) {
            return node;
        }
        int i = 1;
        Stack<Node> st = new Stack<>();
        while (i < k && node != null) {
            st.push(node);
            i++;
            node = node.next;
        }
        Node temp = node;
        node = null;
        while (!st.isEmpty()) {
            if (node == null) {
                node = st.pop();
            } else {
                node.next = st.pop();
                node = node.next;
            }
        }
        if (temp != null) {
            assert node != null;
            node.next = reverse(temp, k);
        }
        return node;
    }

    static Node sortedMerge(Node head1, Node head2) {
        Node output = null;
        Node temp = null;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                if (output == null) {
                    output = head1;
                    temp = output;
                } else {
                    temp.next = head1;
                    temp = temp.next;
                }
                head1 = head1.next;
            } else {
                if (output == null) {
                    output = head2;
                    temp = output;
                } else {
                    temp.next = head2;
                    temp = temp.next;
                }
                head2 = head2.next;
            }
        }
        while (head1 != null) {
            if (output == null) {
                output = head1;
                temp = output;
            } else {
                temp.next = head1;
                temp = temp.next;
            }
            head1 = head1.next;
        }
        while (head2 != null) {
            if (output == null) {
                output = head2;
                temp = output;
            } else {
                temp.next = head2;
                temp = temp.next;
            }
            head2 = head2.next;
        }

        return output;
    }

    static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = null;
        Node cur = head;
        while (cur != null) {
            cur = head.next;
            head.next = temp;
            temp = head;
            head = cur;
        }
        return temp;
    }

    static void rearrangeEvenOdd(Node head) {
        if (head == null || head.next == null) return;
        Node root = head;
        Node temp = root.next;
        while (temp.next != null) {

            root.next = temp.next.next;
            root.next.next = temp;

            temp = temp.next;
        }

    }

    public static void removeLoop(Node head) {
        if (head == null || head.next == null) return;
        Node slow = head;
        Node fastptr = head.next;
        boolean status = false;
        while (fastptr != null && fastptr.next != null) {
            if (slow == fastptr) {
                status = true;
                break;
            }
            slow = slow.next;
            fastptr = fastptr.next.next;
        }
        if (status) {
            slow = head;
            while (fastptr.next != slow) {
                fastptr = fastptr.next;
                slow = slow.next;
            }
            fastptr.next = null;
        }
    }

    static int intersectPoint(Node head1, Node head2) {
        int head1Length = 0;
        Node newHead1 = head1;
        Node newHead2 = head2;
        while (head1 != null) {
            head1Length++;
            head1 = head1.next;
        }
        int head2Length = 0;
        while (head2 != null) {
            head2Length++;
            head2 = head2.next;
        }
        if (head1Length > head2Length) {
            while (head1Length != head2Length) {
                assert newHead1 != null;
                newHead1 = newHead1.next;
                head1Length--;
            }
        } else {
            while (head2Length != head1Length) {
                assert newHead2 != null;
                newHead2 = newHead2.next;
                head2Length--;
            }
        }
        while (newHead1 != null && newHead2 != null && newHead1.next != newHead2.next) {
            newHead1 = newHead1.next;
            newHead2 = newHead2.next;
        }
        assert newHead1 != null;
        if (newHead1.next != null) {
            return newHead1.next.data;
        } else {
            return -1;
        }

    }

    public static Node rotate(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        if (k == 1) {
            head = head.next;
            temp.next = null;
            Node newHead = head;
            while (head.next != null) {
                head = head.next;
            }
            head.next = temp;
            return newHead;
        }

        while (k-- > 1) {
            head = head.next;
        }
        if (head.next != null) {
            Node newHead = head.next;
            head.next = null;
            head = newHead;
            while (head.next != null) {
                head = head.next;
            }
            head.next = temp;
            return newHead;
        } else {
            return temp;
        }
    }

    public Node flatten(Node A) {
        if (A.next == null) {
            return A;
        }
        Node output = null;
        output = mergeSortedLinkedList(A, output);
        while (A.next != null) {
            output = mergeSortedLinkedList(output, A.next);
            A = A.next;
        }
        return output;
    }

    public Node mergeSortedLinkedList(Node A, Node B) {

        if (A == null) return B;
        if (B == null) return A;

        if (A.data < B.data) {
            A.next = mergeSortedLinkedList(A.bottom, B);
            return A;
        } else {
            B.next = mergeSortedLinkedList(A, B.bottom);
            return B;
        }
    }
}
