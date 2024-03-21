package com.chicky;

import java.util.Arrays;

import static com.sushmitha.BubbleSort.bubble;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubble(arr, arr.length);
        System.out.println(Arrays.toString(arr));


    }
    public static void bubble(int[] arr ,int n){
        if(n == 1){
            return;
        }
        for(int i =0 ; i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubble(arr,n-1);
    }
}
