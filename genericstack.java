package com.sushmitha;

import java.util.*;
    public class genericstack <E> {
        Stack <E> stk = new Stack <E>();
	public void push(E obj) {
        stk.push(obj);
	}
    public E pop() {
        E obj = stk.pop();
	    return obj;
	}
    }
    class Output {
        public static void main(String args[]) {
            genericstack <String> gs = new genericstack<String>();
            gs.push("Hello");
            System.out.println(gs.pop());
        }
    }