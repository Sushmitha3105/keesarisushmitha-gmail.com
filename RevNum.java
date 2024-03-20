package com.Recursion;

public class RevNum {
    static int sum =0;
    private static void NumRev(int n) {

        if(n==0){
            return ;
        }
        int rem =n%10;

        sum = sum * 10  + rem;
        NumRev(n/10);
    }


    static void NumRev2(int n , int arg){

    }
    public static void main(String[] args) {
        NumRev(1234);
        System.out.println(sum);


    }




}
