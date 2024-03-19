package com.PracticeThreads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReentranatLock{
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                performAction();

            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                performAnotherAction();

            }
        });
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> {
            // Thread 1: Acquire lock1 then lock2
            Thread.currentThread().setName("Thread 1");
            performAction();
        });
        executor.submit(() -> {
            // Thread 2: Acquire lock2 then lock1
            Thread.currentThread().setName("Thread 2");
            performAnotherAction();
        });

        executor.shutdown();
    }
    public static void performAction() {
        lock1.lock();
        try {
            System.out.println("Try  from lock1, when lock 1 is locked");
            try {
                lock2.lock();
                System.out.println("Try after lock2 is locked");

            } finally {
                lock2.unlock();
                System.out.println("lock 2 is unlocked ");
            }
        } finally {
            lock1.unlock();
        }
    }
    public static void performAnotherAction() {
        lock2.lock();
        try {
            System.out.println("Try from lock 2 , when lock2 is locked");
            try {
                lock1.lock();
                System.out.println(" try after lock1 is locked");
            } finally {
                lock1.unlock();
            }
            System.out.println("lock1 is unlocked");
        } finally {
            lock2.unlock();
        }
    }

}
