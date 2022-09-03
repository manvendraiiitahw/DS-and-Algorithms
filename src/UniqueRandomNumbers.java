import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class UniqueRandomNumbers {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i=1; i<11; i++) {
//            list.add(new Integer(i));
//        }
//        Collections.shuffle(list);
//        for (int i=0; i<3; i++) {
//            System.out.println(list.get(i));
//        }
        ThreadLocalRandom.current().ints(1, 99999).distinct().limit(20000).forEach(System.out::println);
    }
}