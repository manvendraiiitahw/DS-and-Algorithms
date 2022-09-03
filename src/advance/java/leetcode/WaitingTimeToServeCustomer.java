package advance.java.leetcode;

import java.util.PriorityQueue;
import java.util.Scanner;

public class WaitingTimeToServeCustomer {
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    static PriorityQueue<Integer> pq1 = new PriorityQueue<>();

    public static void main(String[] args) {
        int[] t = {2, 4, 5, 2, 3, 5};
        Scanner scanner = new Scanner(System.in);
        int N = t.length;
        int c = scanner.nextInt();
        for (int i : t) {
            pq.add(i);
        }
        int i = 0;
        while (i < c && i < N) {
            pq1.add(pq.poll());
            i++;
        }
        int time = 0;
        fillQueue();
        while (true) {
            int c1 = scanner.nextInt();
            while (pq.isEmpty()) {
                time++;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            pq1.add(pq.poll());
            System.out.println("time taken to serve customer:" + c1 + " =" + time);
        }

    }

    static void fillQueue() {
        int tt = 0;
        while (true) {
            if (!pq1.isEmpty() && pq1.peek() == tt) {
                pq.add(pq1.poll());
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tt++;
        }
    }
}


