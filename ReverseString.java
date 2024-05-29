package DSA100;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String a = "abcde";

        String[] message = {"Hello","World"};
        StringBuilder reverseMessage = new StringBuilder();
        for (int i = message.length-1; i >=0 ; i--) {
            reverseMessage.append(message[i]).append(" ");
        }
        String[] reversedMsg = reverseMessage.toString().split(" ");
        System.out.println(Arrays.toString(reversedMsg));
        method1(a);
        method2(a);

    }


//===============================================================================

    public static void method1(String a) {
        for(int i = a.length()-1 ; i>=0 ; i--){
            System.out.print(a.charAt(i));
        }
        System.out.println(" ");
    }

    public static void method2(String a){
        StringBuilder reverseA = new StringBuilder();
        reverseA.append(a);
        reverseA.reverse();
        System.out.println(reverseA);

    }



}
