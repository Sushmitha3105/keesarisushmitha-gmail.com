package com.meghana;

class LastWordLength{

    public static void main(String[] args) {
        String s = "hai my name is sushmitha";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                System.out.println(s);
                return (s.length()-i-1);
            }
        }
        return s.length();
        
    }
}