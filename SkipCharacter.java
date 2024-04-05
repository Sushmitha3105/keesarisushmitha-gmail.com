package com.meghana;

public class SkipCharacter {
    public static void main(String[] args) {
        String s1  ="abcdabcd";
        System.out.println(skip1(s1));
    }
    public static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch,up.substring(1));
        }

    }

    static String skip1(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip1(up.substring(1));
        }
        else {
            return ch + skip1(up.substring(1));
        }
    }
}