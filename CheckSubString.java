package com.meghana;

class CheckSubString {

    public static void main(String[] args) {
        String haystack = "haihelloall";
        String needle = "hello";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        for(int i =0, j = needle.length(); j<= haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
        
    }
}