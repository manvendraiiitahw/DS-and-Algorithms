package learnlinkedlist;

import java.util.Scanner;

public class FindKthNodeFromEndOfLinkedList {
    public static void main(String[] args) {
        SingleLinkedList head = new SingleLinkedList(1);
        head.next = new SingleLinkedList(2);
        head.next.next = new SingleLinkedList(3);
        head.next.next.next = new SingleLinkedList(4);
        head.next.next.next.next = new SingleLinkedList(5);
        head.next.next.next.next.next = new SingleLinkedList(6);
        head.next.next.next.next.next.next = new SingleLinkedList(7);
        SingleLinkedList tmp = head;
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
        head = tmp;
        Scanner scanner = new Scanner(System.in);//same as scanf
        System.out.println("Please enter the value of k");
        int k = scanner.nextInt();
        if (head == null) {
            System.out.println("Linked list is null");
            return;
        }
        int size = 1;
        while (head.next != null) {
            size++;
            head = head.next;
        }
        FindKthNodeFromEndOfLinkedList.findKthNodeFromEnd(tmp, k, size);
        if (k > size || k < 1) {
            System.out.println("Please pass correct value of k");
            return;
        }
        int j = size - k + 1;
        int i = 1;
        head = tmp;
        while (i < j) {
            head = head.next;
            i++;
        }
        System.out.println("Kth Node from end of linkedList=" + head.data);
    }

    static void findKthNodeFromEnd(SingleLinkedList head, int k, int size) {
        SingleLinkedList tmp = head;
        if (k < 1 || k > size) {
            System.out.println("Please pass correct value of k");
            return;
        }
        while (k > 1) {
            tmp = tmp.next;
            k--;
        }
        while (tmp.next != null) {
            tmp = tmp.next;
            head = head.next;
        }
        System.out.println("Kth Node from end of linkedList=" + head.data);
    }
}
