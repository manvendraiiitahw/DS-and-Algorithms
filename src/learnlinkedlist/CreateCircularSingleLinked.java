package learnlinkedlist;

public class CreateCircularSingleLinked {
    public static void main(String[] args) {
        SingleLinkedList temp = new SingleLinkedList(1);
        temp.next = new SingleLinkedList(2);
        temp.next.next = new SingleLinkedList(3);
        temp.next.next.next = new SingleLinkedList(4);
        SingleLinkedList head = temp;
        temp.next.next.next.next=head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        while (temp != head);

    }
}

