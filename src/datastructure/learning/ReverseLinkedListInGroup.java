package datastructure.learning;

public class ReverseLinkedListInGroup {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList(1);
        singleLinkedList.next = new SingleLinkedList(2);
        singleLinkedList.next.next = new SingleLinkedList(3);
        singleLinkedList.next.next.next = new SingleLinkedList(14);
        singleLinkedList.next.next.next.next = new SingleLinkedList(4);
        singleLinkedList.next.next.next.next.next = new SingleLinkedList(5);
        singleLinkedList.next.next.next.next.next.next = new SingleLinkedList(6);
        singleLinkedList.next.next.next.next.next.next.next = new SingleLinkedList(7);
        singleLinkedList.next.next.next.next.next.next.next.next = new SingleLinkedList(8);
        singleLinkedList.next.next.next.next.next.next.next.next.next = new SingleLinkedList(9);
        singleLinkedList.next.next.next.next.next.next.next.next.next.next = new SingleLinkedList(10);
        SingleLinkedList output = reverse(singleLinkedList, 3);
        while (output != null) {
            System.out.println(output.data);
            output=output.next;
        }
    }

    static SingleLinkedList reverse(SingleLinkedList head, int k) {
        if (head == null) return null;
        SingleLinkedList temp = null;
        SingleLinkedList cur = head;
        SingleLinkedList next = null;
        int i = 0;
        while (i < k && cur != null) {
            next = cur.next;
            cur.next = temp;
            temp = cur;
            cur = next;
            i++;
        }
        if (next != null) {
            head.next = reverse(next, k);
        }
        return temp;
    }
}

