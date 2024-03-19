package com.PracticeThreads;

public class ThreadInterference extends Thread{
    public void run(){
        System.out.println("hai");
    }
}
class Counter{
    int count =0;
    public void increment(){
        count++;
        System.out.println(count);

    }
    public void decrement(){
        count--;
        System.out.println(count);
    }
}

class ex2{
    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();

        new Thread(()->a.decrement()).start();
        new Thread(()->b.increment()).start();



    }
}