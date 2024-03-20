package com.Recursion;

public class DigitsProduct {
    public static void main(String[] args) {
       int y = product(1234);
        System.out.println(y);

    }

    private static int  product(int n) {
        if(n%10==n){
            return n;
        }
        return (n%10)*product(n/10);
    }
}
