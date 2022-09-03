package coding.dcp.ms;

public class AddTwoNumbersRepresentedByLinkedLists {
    public static void main(String[] args) {
        SingleLinkedList head1 = new SingleLinkedList(5);
        head1.next = new SingleLinkedList(6);
        head1.next.next = new SingleLinkedList(3);
        SingleLinkedList head2 = new SingleLinkedList(8);
        head2.next = new SingleLinkedList(4);
//        head2.next.next = new SingleLinkedList(2);
        SingleLinkedList output = addTwoNumbers(head1, head2);
        while (output != null) {
            System.out.print(output.data + "->");
            output = output.next;
        }
    }

    static SingleLinkedList addTwoNumbers(SingleLinkedList head1, SingleLinkedList head2) {
        SingleLinkedList output = null;
        SingleLinkedList output1 = output;
//        head1 = reverse(head1);
//        head2 = reverse(head2);
        int carry = 0;
        while (head1 != null && head2 != null) {
            int val = head1.data + head2.data;
            val = val + carry;
            carry = 0;
            if (val > 10) {
                carry = val / 10;
                val = val % 10;
            }
            if (output == null) {
                output = new SingleLinkedList(val);
                output1 = output;
            } else {
                output.next = new SingleLinkedList(val);
                output = output.next;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        while (head1 != null) {
            int val = head1.data + carry;
            carry = 0;
            if (val > 10) {
                carry = val / 10;
                val = val % 10;
            }
            if (output == null) {
                output = new SingleLinkedList(val);
                output1 = output;
            } else {
                output.next = new SingleLinkedList(val);
                output = output.next;
            }
            head1 = head1.next;
        }
        while (head2 != null) {
            int val = head2.data + carry;
            carry = 0;
            if (val > 10) {
                carry = val / 10;
                val = val % 10;
            }
            if (output == null) {
                output = new SingleLinkedList(val);
                output1 = output;
            } else {
                output.next = new SingleLinkedList(val);
                output = output.next;
            }
            head2 = head2.next;
        }
        if (carry > 0) {
            output.next = new SingleLinkedList(carry);
        }
        return output1;

    }

    static SingleLinkedList reverse(SingleLinkedList head) {
        SingleLinkedList cur = head;
        SingleLinkedList temp = null;

        while (cur != null) {
            cur = head.next;
            head.next = temp;
            temp = head;
            head = cur;
        }
        return temp;
    }
}
