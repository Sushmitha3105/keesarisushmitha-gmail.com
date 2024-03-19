package com.chicky;

public class FiboRecu {
    public static void main(String[] args) {
        int y =fibanocci(50);
       System.out.println(y);
       // System.out.println(fact(3));
    }
    static int fibanocci(int n){

        if(n == 0 || n == 1){
            return n;
        }

        return  fibanocci(n-1) + fibanocci(n-2);
    }

    static  int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
