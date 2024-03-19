package com.meghana;

import java.util.concurrent.ArrayBlockingQueue;

 class ArrayBlockingQueueExample {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> priorityBlockingQueue = new ArrayBlockingQueue<>(5);

        new Thread(()->{
            int i =0;
            while(true){
                try {
                    priorityBlockingQueue.put(i++);
                    System.out.println("Added" +i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        new Thread(()->{
            while (true){
                Integer poll = null;
                try {
                    poll = priorityBlockingQueue.take();
                    System.out.println("poll" +poll);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(poll);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
