package com.sushmitha;

public class EX2 {
    public static <T> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if ((int)e > (int)elem)  // compiler error
                ++count;
        return count;
    }
}
