package com.meghana;

class MinLen {
    public static void main(String[] args) {
        String  a = "abbcadbba";
        minimumLength(a);
    }
    public static int minimumLength(String s) {
        skip(s);
        return s.length();
    }
    public static String skip(String s){
        if(s.isEmpty()){
            System.out.println(s);
            return "";

        }
        if(s.charAt(0)==s.charAt(s.length()-1) && s.substring(0,1) == s.substring(s.length()-2,s.length()-1)){
            return skip(s.substring(1));
        }
        else{
            return s.charAt(0)+skip(s.substring(1));
        }
    }

}