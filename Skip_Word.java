package com.meghana;

public class Skip_Word {
    public static void main(String[] args) {
        System.out.println(skipApple("abachapplesew"));
    }
    static String skipApple(String word){
        if(word.isEmpty()){
            System.out.println(word);
            return " ";
        }
        if(word.startsWith("apple")){
            return skipApple(word.substring(5));
        }else {
            return word.charAt(0)+skipApple(word.substring(1));
        }
    }
}
