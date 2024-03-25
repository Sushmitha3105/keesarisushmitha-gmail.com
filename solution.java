package com.meghana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class intersectionoftwoarrays{
    public static void main(String[] args) {
         int[] nums1 = {1,2,4,5,7,8,9};
         int[] nums2 = {2,7,8};
        System.out.println(intersection(nums1,nums2));
    }
    public  static List<Integer> intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> newList = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (newList.isEmpty() || newList.get(newList.size() - 1) != nums1[i]) {
                    newList.add(nums1[i]);
                }
                i++;
                j++;

            } else if (nums1[i] < nums2[j]) {
                i++;
            } else j++;
        }


        return newList;
    }
}