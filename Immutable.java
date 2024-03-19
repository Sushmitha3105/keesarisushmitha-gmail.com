package com.sushmitha;

public class Immutable {
    public static void main(String[] args) {
        String s  = "Hello";
        s=s+"world";
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hi");
        sb.append("hello");
        System.out.println(sb);

    }
}
