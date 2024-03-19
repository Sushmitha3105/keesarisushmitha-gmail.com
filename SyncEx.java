package com.PracticeThreads;
public class SyncEx extends Thread{
    public void run(){
        System.out.println("Running thread is" + currentThread().getName());
    }
    public static void main(String[] args) {
         SyncEx t1 = new SyncEx();
         SyncEx t2 = new SyncEx();
         SyncEx t3 = new SyncEx();

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.setPriority(6);
        t2.setPriority(10);
        t3.setPriority(1);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();
        t2.start();


    }
}