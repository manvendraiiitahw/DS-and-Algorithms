package advance.java.leetcode;

import java.sql.Timestamp;

public class DesignAHitCounter {
    static long[] timed = new long[300];
    static int[] hits = new int[300];

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis() / 10;
//        while (true) {
//            long timestamp = System.currentTimeMillis()/10;
//            if(timestamp-start>=300){
//                System.out.println("Number of hits in last 5 minutes:::"+getHits(timestamp));
//                Thread.sleep(1000);
//            }
//            hits(timestamp);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    long timestamp = System.currentTimeMillis() / 10;
                    int id = (int) (timestamp % 300);
                    if (timed[id] != timestamp) {
                        timed[id] = timestamp;
                        hits[id] = 1;
                    } else {
                        hits[id]++;
                    }
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    long timestamp = System.currentTimeMillis() / 10;
                    int out = 0;
                    for (int i = 0; i < 300; i++) {
                        if (timestamp - timed[i] < 300) {
                            out += hits[i];
                        }
                    }
                    System.out.println("Number of hits in last 5 minutes:::" + getHits(timestamp));
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();

//        }
    }

    static void hits(long timestamp) {

        int id = (int) (timestamp % 300);
        if (timed[id] != timestamp) {
            timed[id] = timestamp;
            hits[id] = 1;
        } else {
            hits[id]++;
        }
    }

    static int getHits(long timestamp) {
        int out = 0;
        for (int i = 0; i < 300; i++) {
            if (timestamp - timed[i] < 300) {
                out += hits[i];
            }
        }
        return out;
    }

}
