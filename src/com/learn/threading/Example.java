package com.learn.threading;

public class Example {
    public static void main(String[] args) {


//        DeadLockExample deadLockExample=new DeadLockExample();
//        Thread t1=new Thread(
//                deadLockExample::increaseCounter
//        );
//
//        Thread t2=new Thread(
//                () -> {
//                    for (int i=0;i<100;i++) {
//                        System.out.println(deadLockExample.getCounter());
//                    }
//                }
//        );
//        t1.start();
//        t2.start();

    }

    static class DeadLock1 implements Runnable {

        @Override
        public void run() {

        }
    }

    static class DeadLock2 implements Runnable {

        @Override
        public void run() {

        }
    }
}
