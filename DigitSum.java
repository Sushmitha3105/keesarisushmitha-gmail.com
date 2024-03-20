package com.Recursion;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }

    static int sumOfDigits(int N){
        if(N==0){
            return 0;
        }
        return (N%10)+sumOfDigits(N/10);

    }
}
