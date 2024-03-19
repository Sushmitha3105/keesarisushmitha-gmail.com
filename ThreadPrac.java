package com.PracticeThreads;
class ThreadPrac extends Thread {

    public void run(){
        System.out.println("running thread is" + currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadPrac t1  = new ThreadPrac();
        ThreadPrac t2 = new ThreadPrac();
        t1.start();
        t1.join();
        t2.start();
    }
}

//=========== CREATING THREADS====================
class ThreadEx1 implements Runnable{

    @Override
    public void run() {
        System.out.println("hello all");
    }

    public static void main(String[] args) {
        ThreadEx1 t1 = new ThreadEx1();
        Thread myThread = new Thread(t1);
        myThread.start();
    }
}