package com.Recursion;

public class _1toN {
        public static void main(String[] args) {
            funRev(5);
        }
    static void funRev(int m) {
        if(m==0){
            return;
        }
        funRev(m-1);
        System.out.println(m);

    }
}
