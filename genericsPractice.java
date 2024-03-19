package com.sushmitha;

class container<T>{
    T value;
    public void show(){
        System.out.println(value.getClass().getName());
    }
}
public class genericsPractice {
    public static void main(String[] args) {
        container<Integer> a = new container<>();
        a.show();

    }
}


