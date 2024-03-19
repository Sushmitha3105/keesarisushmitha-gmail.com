package com.meghana;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();

        hs.add(" Hi");
        hs.add("Hello");
        hs.add("I'm");
        hs.add("Sushmitha");
        hs.add("Kesari");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
