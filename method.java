package com.PracticeThreads;
public class method {
    synchronized void function(int n) {
        for (int i = 0; i <= 3; i++) {
            System.out.println(n + i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Example{
    public static void main(String[] args) {
        method m1 = new method();
        Thread a = new Thread(){
            public void run(){
                m1.function(10);
            }
        };
        Thread b = new Thread(){
            public void run(){
                m1.function(20);
                 }
             };
        a.start();
        b.start();

         }
}


