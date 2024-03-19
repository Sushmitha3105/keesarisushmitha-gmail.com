package com.sushmitha;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr  = { 1,2,3,5,7,6,3,2};
        int ans = peak(arr);
        System.out.println(ans);

    }

    private static int peak(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid =(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;

            } else {
                start = mid+1;

            }
        }
        return start;
    }

}
