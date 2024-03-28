package com.meghana;

class MergeStringAlternatively{
    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 ="hello";
        System.out.println(mergeAlternately(s1,s2));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int MaxLength = Math.max(word1.length() , word2.length());
            for(int i =0 ; i<MaxLength ; i++){
                if(i<word1.length()){
                    sb.append(word1.charAt(i));
                }
                if(i<word2.length()){
                    sb.append(word2.charAt(i));
                }
            
        }
        return sb.toString();
    }
}