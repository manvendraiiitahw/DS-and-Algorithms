package datastructure.learning;

public class LinkedList<S> {
    LinkedList<S> prev, next;
    int data;

    public LinkedList(int data) {
        this.data = data;
        prev = null;
        next = null;
    }

}
