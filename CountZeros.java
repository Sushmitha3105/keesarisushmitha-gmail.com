package com.Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(Zeros(1020304000,0));
    }

    static int Zeros(int n , int count){

        if(n == 0){
            return count;
        }

        int Rem = n % 10;
        if (Rem == 0 ){
            return Zeros(n/10,count+1);
        }
        return Zeros(n/10,count);
    }
}
