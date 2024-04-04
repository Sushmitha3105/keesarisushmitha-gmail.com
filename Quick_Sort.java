package com.meghana;

import java.util.Arrays;

public class Quick_Sort {

    public static void main(String[] args) {
        int[] nums = {8,5,2,7,1};
        sort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
    public static void sort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int m = (s+e)/2;
        int pivot = arr[m];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);
    }
}
