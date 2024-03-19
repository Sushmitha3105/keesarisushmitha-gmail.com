package com.meghana;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(11);
        for(int i =0;i<=5;i++){
            al.add(i);
        }
        System.out.println(al);
        al.add(6,7); // here if index is 7 i'm getting index out
        // of bound exception becoz, the index value must be equal to or less than the size
        // of arraylist  must not exceed the size of array of arraylist.
        System.out.println(al);
        al.add(7,8);//here i'm able to print with index value 7 becoz
        // now the size of arraylist is 7.
        System.out.println(al);
      //  al.add(9,6); //index out of bound exception because
        // size is 8 but index value is 9.

       int y = al.get(7);
        System.out.println(y);
        al.toArray();
        for (Object i : al.toArray()) {
           // System.out.print(i);
        } // o/p - 01234578

        al.remove(6);
        System.out.println(al);
        System.out.println(al.contains(8));
        System.out.println(al.clone());
        System.out.println(al.lastIndexOf(al));
        System.out.println(al.isEmpty());




    }
}
