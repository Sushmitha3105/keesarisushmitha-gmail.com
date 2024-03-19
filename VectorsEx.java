package com.meghana;

import java.util.ArrayList;
import java.util.Vector;

public class VectorsEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(5);
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(5);

        System.out.println(v);
        System.out.println(v.size());

        v.add(3,0);
        System.out.println(v);


        v.clone();
        System.out.println(v);
        System.out.println(v.contains(1));
        System.out.println(v.elementAt(2));
        System.out.println(v.elements());
        System.out.println(v.firstElement());
        System.out.println(v.indexOf(4));
        System.out.println(v.hashCode());
        System.out.println(v.isEmpty());
        System.out.println(v.isEmpty());
        System.out.println(v.remove(2));
        System.out.println(v);

        System.out.println(v.set(2,1));
        System.out.println(v);
        System.out.println(v.capacity()); // need to know this later!!
        System.out.println(v.capacity());// ;






        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(1,0);
      //  System.out.println(a);

    }
}
