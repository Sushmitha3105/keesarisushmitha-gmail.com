package com.meghana;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        Stack<String> s = new Stack<>();
        s.push("hi");
        s.push("hello");
        st.push(10);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(s);
      //    System.out.print(itr.next()+" ");
//        }
//        st.pop()System.out.println(st);
//
//
////        Iterator<Integer> itr = st.iterator();
////        while (itr.hasNext()){
////      //    ;
        System.out.println(st.pop());

        st.add(6);
        System.out.println(st);
        st.add(7);
        System.out.println(st);
        System.out.println(st.peek());  //returns last element
        System.out.println(st.empty());
        System.out.println(st.search(6)); //returning size -i value
        System.out.println(st.capacity());   ///DOUBT

        


    }
}
