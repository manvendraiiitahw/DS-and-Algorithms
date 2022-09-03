package advance.java.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;


// Need to print tree node whose parent Node is given

/**
 *               0
 *              1
 *        8       2      3
 *    5   6      9       4
 *    7     0
 */

public class Testt {
    public static void main(String[] args) {
        List<Node> nodes=new ArrayList<>();
        nodes.add(new Node(1L,0L));
        nodes.add(new Node(8L,1L));
        nodes.add(new Node(2L,1L));
        nodes.add(new Node(3L,1L));
        nodes.add(new Node(5L,8L));
        nodes.add(new Node(6L,8L));
        nodes.add(new Node(7L,5L));
        nodes.add(new Node(0L,6L));
        nodes.add(new Node(9L,2L));
        nodes.add(new Node(4L,3L));

        Stream<Node> nodeStream=filterSubTree(nodes.stream(),8L);
        nodeStream.forEach(node -> System.out.println(node.id));
    }
    static Stream<Node> filterSubTree(Stream<Node> stream, Long rootId) {
        List<Long> targetIds = new ArrayList<>();
        return stream.filter(node -> {
           if (Objects.equals(node.id, rootId) || targetIds.contains(node.parentId)) {
               targetIds.add(node.id);
               return true;
           } else {
               return false;
           }
       });
    }

    static class Node {
        public Long id;
        public Long parentId;
        public Node(Long id, Long parentId){
            this.id=id;
            this.parentId=parentId;
        }
    }


}