package DSA100;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    //    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,7,8};
//
//        System.out.println("Originam Array is :" +Arrays.toString(nums));
//        System.out.println("Reverse Order is : ");
//        for(int i = nums.length-1;i>=0;i--){
//            System.out.print( nums[i]+" ");
//        }
//    }
//====================================================================================
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 4, 5};
        int end = n1.length - 1;
        int start = 0;
        System.out.println(Arrays.toString(n1));
        while (start < end) {
            int temp = n1[start];
            n1[start] = n1[end];
            n1[end] = temp;
            start++;
            end--;
        }


        for (int i = 0; i < n1.length; i++) {
            System.out.print(n1[i] + " ");
        }
    }
}



    //===============================================================================








