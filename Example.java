package com.sushmitha;

import java.io.PrintStream;

public class Example {

    public static void main(String[] args) {

    }
    class  Glass<T>{
        private T liquid;
        void add(int a , int b){
            System.out.println(a+b);

        }
    }
    class juice{

        String type(PrintStream out) {
            System.out.println("enter a number");
            return type(System.out);
        }

    }
    class water{

    }

    Glass<juice>  juiceGlass = new Glass<>();
    Glass<water> waterGlass = new Glass<>();
    
}
