package com.sushmitha;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 7,5,6,2,4,1,3};
        int[] arr1 = {1,2,4,2,5,6,5};
        sort(arr1);
        sort(arr);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i =0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else i++;
        }
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i]=arr[correct];
        arr[correct]= temp;
    }
}
