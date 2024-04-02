package com.sushmitha;

import org.w3c.dom.ls.LSOutput;

public class Pali {
    public static void main(String[] args) {
        String a = "anuna";
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        String rev = sb.toString();
        if(a.equals(rev)){
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");

    }
}
