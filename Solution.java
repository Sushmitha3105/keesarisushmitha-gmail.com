package com.Recursion;

class Solution {
    public static int numberOfSteps(int num,int steps) {
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return numberOfSteps(num/2,steps+1);
        }
        return numberOfSteps(num-1,steps+1);
        
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(3,0));
    }
}