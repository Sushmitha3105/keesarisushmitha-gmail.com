package com.chicky;

public class LineraSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        System.out.println(linearSearch(arr,0,9));
    }
    public static int  linearSearch(int[] arr, int index ,int target){
        if (arr[index] == arr.length-1 || arr[index] ==target){
            return index;
        }
        return linearSearch(arr,index+1,target);


    }
}
