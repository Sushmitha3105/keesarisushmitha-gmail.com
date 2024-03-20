package com.Recursion;

public class Nto1 {
    public static void main(String[] args) {
        System.out.println( funSum(5));

    }

    private static void fun(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        fun(n - 1);


    }

    private static int funProduct(int n) {
        if (n == 0||n==1) {
            return 1;
        }
        return n*funProduct(n-1);

    }

    private static int funSum(int n) {
        if (n == 0||n==1) {
            return 1;
        }
        return n + funSum(n-1);

    }
}
