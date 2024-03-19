package com.PracticeThreads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    private static AtomicInteger counter = new AtomicInteger();
        public void run() {
            for(int i =0;i<=10;i++){
                System.out.println(counter.incrementAndGet());
            }
        }



    public static void main(String[] args) {
//        Runnable task =(()->{
//            for(int i =0;i<10;i++){
//                System.out.println(counter.incrementAndGet());
//            }
//
//        });

//        new Thread(( new Runnable() {
//            @Override
//            public void run() {
//                for(int i =0;i<=10;i++){
//                    System.out.println(counter.incrementAndGet());
       // System.out.println(counter.);
//                }
//
//            }
//        }));
        AtomicExample a1 = new AtomicExample();
        Thread t1 = new Thread((Runnable) a1);
        Thread t2 = new Thread((Runnable) a1);
        t1.start();
//        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.incrementAndGet());

    }



}
