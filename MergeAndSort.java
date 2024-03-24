package com.meghana;

import java.util.Arrays;

class MergeAndSort{
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int m = 3;
        int[] nums2 = {2,4,6};
        int n = 6;

        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        
    
    }
}