package com.sushmitha;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();
        boolean a = sc.hasNext();
        System.out.println(n);
        System.out.println(a);

    }
}
