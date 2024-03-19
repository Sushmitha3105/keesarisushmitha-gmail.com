package com.sushmitha;

import org.w3c.dom.ls.LSOutput;

public class Pali {
    public static void main(String[] args) {
        String a = "anuna";
        int start =a.charAt(0);
        int end = a.charAt(4);
        if(start<=end && start == end){
            start++;
            end--;
        }else System.out.println("Not Palindrome");
        System.out.println("Palindrome");

    }
}
