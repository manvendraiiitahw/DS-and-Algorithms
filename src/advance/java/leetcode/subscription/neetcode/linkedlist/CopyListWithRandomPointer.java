package advance.java.leetcode.subscription.neetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    public static void main(String[] args) {
        Node node = new Node(7);
        node.next = new Node(13);
        node.next.next = new Node(11);
        node.next.next.next = new Node(10);
        node.next.next.next.next = new Node(1);
        node.random = null;
        node.next.random = node;
        node.next.next.random = node.next.next.next;
        node.next.next.next.random = node.next.next;
        node.next.next.next.next.random = node;
        CopyListWithRandomPointer pointer = new CopyListWithRandomPointer();
        Node newNode = pointer.copyRandomList(node);
        while (newNode != null) {
            System.out.println(newNode.val + " " + newNode.random);
            newNode = newNode.next;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Map<Node, Node> nodeNodeMap = new HashMap<>();

        Node temp = head;
        while (temp != null) {
            nodeNodeMap.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            Node t = nodeNodeMap.get(temp);
            t.next = nodeNodeMap.get(temp.next);
            t.random = nodeNodeMap.get(temp.random);
            temp = temp.next;
        }

        return nodeNodeMap.get(head);

    }
}
