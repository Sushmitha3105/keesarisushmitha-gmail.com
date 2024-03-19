package com.PracticeThreads;

import ThreadsAgain.DeadLockEx;

public class DeadLock2 {
    Thread t1 = new Thread(){
        public void run(){
            try {
                Thread.currentThread().join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    };

    Thread t2 = new Thread(){
        public void run(){
            try {
                Thread.currentThread().join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    };

    public static void main(String[] args) {
        DeadLock2 d1 = new DeadLock2();
        d1.t1.start();
        d1.t2.start();
    }

}
