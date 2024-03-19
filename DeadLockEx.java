package com.PracticeThreads;

public class DeadLockEx {
    String s1 = "Meghana";
    String s2 = "Sushmitha";

    Thread t1 = new Thread(){
        public void run(){
            while (true){
                synchronized (s1){
                    try {
                       System.out.println(currentThread().getName() + " locked s1 of thread 1");
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (s2){
                        System.out.println(s1 + s2);
                    }
                }
            }
        }
    };

    Thread t2 = new Thread(){
        public void run(){
            while(true){
                synchronized (s2){
                    System.out.println(currentThread().getName()+"locked s2 of thread2");
                    synchronized (s1){
                        System.out.println(s1 + s2);
                    }
                }
            }

        }
    };


//     try {
//        //==========
//        Thread.currentThread().join(); //=================
//    } catch (InterruptedException e) {
//        throw new RuntimeException(e); =========must be kept in main method
//    }

    public static void main(String[] args) {
        DeadLockEx d1 = new DeadLockEx();
        d1.t1.start();
        d1.t2.start();
    }
}
