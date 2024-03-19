package com.sushmitha;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr  = {-1,3,-2,6,4,-8};
       selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        for(int i = 0 ;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMax(arr,0,last);
            swap(arr,maxIndex,last);
        }

    }

     static void swap(int[] arr , int first , int nxt) {
        int temp = arr[first];
        arr[first]=arr[nxt];
        arr[nxt]= temp;


    }

     static int  getMax(int[] arr , int start, int last) {
        int max = start ;
        for(int i = start;i<=last;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

}
