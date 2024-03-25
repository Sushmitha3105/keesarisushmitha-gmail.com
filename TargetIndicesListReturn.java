package com.meghana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//class TargetIndicesListReturn{
//    public static void main(String[] args) {
//        int[] arr = {1,2,6,4,7,9,7,0}; //{0,1,2,4,6,7,7,9}
//        System.out.println(targetIndices(arr,7));
//        System.out.println(Arrays.toString(arr));
//    }
//    public static List<Integer> targetIndices(int[] nums, int target) {
//        for (int i = 0; i <= nums.length-1; i++) {
//            for (int j =1 ; j<nums.length ; j++) {
//                if (nums[j] < nums[j-1]) {
//                    swap(nums, j, j-1);
//                } else {
//                    i++;
//                }
//            }
//            List<Integer> ans = new ArrayList<>();
//            for (int index = 0; index < nums.length; index++) {
//                if (nums[index] == target) {
//                    ans.add(index);
//                }
//            }
//            return ans;
//        }
//        return new ArrayList<>();
//
//    }
//    public static void swap(int[] arr ,int first , int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//
//}


class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 7,4, 9, 7, 0};
        //{0,1,2,4,4,6,7,7,9}
        System.out.println(targetIndices(arr,4));
        System.out.println(Arrays.toString(arr));
    }
    public static List<Integer> targetIndices(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target) {
                    ans.add(index);
            }
        }
        return ans;
    }
}

