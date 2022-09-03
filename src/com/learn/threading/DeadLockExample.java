package com.learn.threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {

    private int counter = 0;
    Lock lock = new ReentrantLock();

    public void increaseCounter() {
        lock.lock();
        for (int i = 0; i < 100; i++) {
            counter++;
        }
        lock.unlock();

    }

    public int getCounter() {
        lock.lock();
        increaseCounter();
        lock.unlock();
        return counter;

    }
}
