package com.PracticeThreads;

import java.util.concurrent.locks.ReentrantLock;

public class StarvationExample {
    private static final ReentrantLock lock = new ReentrantLock(true); // Fair lock

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(new Worker(), "Thread- 1" + i).start();
            new Thread(new Worker(), "Thread- 2" + i).start();
            new Thread(new Worker(), "Thread- 4" + i).start();
            new Thread(new Worker(), "Thread- 3" + i).start();
        }

    }

    static class Worker implements Runnable {
        public void run() {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " acquired the lock");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } finally {
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName() + " released the lock");
                }

        }
    }
}
