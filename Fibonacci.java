package com.chicky;

public class Fibonacci {

    public static void main(String[] args) {
        int N = 10;
        for(int i =0;i<N;i++){
            System.out.print(fibo(i)+" ");
        }
    }
    public static int fibo(int N){
        if(N==0 || N==1){
            return N;
        }
        return fibo(N-1)+fibo(N-2);
    }
}
