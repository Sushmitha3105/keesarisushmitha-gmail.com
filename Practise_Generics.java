package com.sushmitha;

public class Practise_Generics {
    public static void main(String[] args) {

    }
}
class Maths <T>{
    T t ;
     int length;
    int breadth;
    int radius;
    Maths(int length,int breadth ,int radius){
        this.length=length;
        this.breadth=breadth;
        this.radius = radius;
    }


}

//class  Rectangle1 {
//    int area(){
//        Object t;
//        if(t instanceof Rectangle){
//            return length*breadth;
//        }
//    }


