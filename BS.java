package com.chicky;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,9,11,44,77};
        int target = 9;
       // int y =search(arr,target,0,arr.length-1);
     // System.out.println(y);

    }

    static  int search(int[] arr , int target , int start , int end){
        if(start > end){
            return -1;
        }
        int mid = (start + end)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
             return search(arr , target,start,mid-1 );
        }
        return search(arr,target,mid+1,end);
    }

    public class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Executing thread : " + Thread.currentThread());
        }
        public void main(String[] args) {
            MyRunnable r1 = new MyRunnable();
            MyRunnable r2 = new MyRunnable();
//r1.run();
//r2.run();
            Thread t1 = new Thread(r1);
// Thread-0
//t1.setPriority(10);
            Thread t2 = new Thread(r1);
//Thread-1
            t1.start();
            t2.start();
// t1.start(); //Exception in thread "main" java.lang.IllegalThreadStateException
        } }
}
