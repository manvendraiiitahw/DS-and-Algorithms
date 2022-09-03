package learnlinkedlist;

public class CreateSingleLinked {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList(1);
        singleLinkedList.next = new SingleLinkedList(2);
        singleLinkedList.next.next = new SingleLinkedList(3);
        singleLinkedList.next.next.next = new SingleLinkedList(4);
        SingleLinkedList head = singleLinkedList;
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }

    }
}
