package com.meghana;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(1);
        LL.add(2);
        LL.add(3);
        for(int i =2;i<=6;i++){
            LL.add(i);
        }
        System.out.println(LL);
        LL.add(2,0);
        System.out.println(LL);
        System.out.println(LL.get(2));
        System.out.println(LL.clone()); //Return list

        System.out.println(LL.indexOf(4));
        System.out.println(LL.element()); // gives first element
        System.out.println(LL.getLast());  //last element
        System.out.println(LL.getFirst()); // First Element
        System.out.println(LL.peek());  // Returns head node , that is first element
        System.out.println(LL.offer(4));
        System.out.println(LL);
      //  System.out.println(LL.poll());
        System.out.println(LL.remove(4));
        System.out.println(LL);
        LL.removeFirstOccurrence(1);
        System.out.println(LL);

     //   System.out.println(LL.pollFirst()); // first element
        LL.add(2,0);
     //   LL.pollFirst(); // First element is removed
        LL.pop();
        LL.pop();
        LL.pop();

        System.out.println(LL);
        System.out.println(LL.getFirst());
        System.out.println(LL.size());


    }
}
