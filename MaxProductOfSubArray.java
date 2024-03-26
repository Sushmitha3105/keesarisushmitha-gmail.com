package com.meghana;

import java.util.ArrayList;
import java.util.List;

class MaxProductOfSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] nums1 = {2,3,-2,4};
        int[] n2 = {-1};
       System.out.println(maxProduct(n2));
    }
    public static int maxProduct(int[] nums) {
        int largest = 0;
        List<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums.length == 1){
                return nums[i];
            }else{
                for(int j =1;j<nums.length;j++){
                    int m = nums[j - 1] * nums[j];
                    newArray.add(m);
                }

                for(int k= 0;k<newArray.size();k++){
                    if(newArray.get(k)>largest){
                        largest = newArray.get(k);
                    }
                }
                return largest;
            }
        }
        return largest;

    }
}

   // List<Integer> newArray = new ArrayList<>();
//        for (int i = 1; i < nums.length; i++) {
//            int m = nums[i - 1] * nums[i];
//            newArray.add(m);
//        }
//        int largest = newArray.get(0);
//        for(int i= 1;i<newArray.size();i++){
//            if(newArray.get(i)>largest){
//                largest = newArray.get(i);
//            }
//        }
//
//    return largest;