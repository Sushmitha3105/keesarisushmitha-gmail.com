package com.meghana;

public class SubSequence {
    public static void main(String[] args) {
        subseq(" ","abc");
    }
    static void subseq(String P ,String up){
        if(up.isEmpty()){
            System.out.println(P);
            return ;
        }

        char ch = up.charAt(0);
        subseq(P+ch,up.substring(1));
        subseq(P,up.substring(1));
    }
}
