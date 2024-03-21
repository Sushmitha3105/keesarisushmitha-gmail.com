package com.chicky;

public class ReverseString {
    public static void main(String[] args) {
        char[] str ={'h','e','l','l','o'};
        System.out.println(str);
        ForReverseString(str);
        System.out.println(str);
    }

    public static void ForReverseString(char[] s){
        HelperString(s,0,s.length-1);

    }

    private static void HelperString(char[] s, int start, int end) {
        if(start >= end){
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        HelperString(s,start+1,end-1);
    }
}
