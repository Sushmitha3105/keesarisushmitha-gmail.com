package com.chicky;

import java.util.ArrayList;

public class FindAllIndices {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,4,5,4,6,7,9,0};
        System.out.println(returnList(arr,0,3));

    }

    public static ArrayList<Integer> returnList(int[] arr, int index, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromAbove = returnList(arr,index+1,target);
        list.addAll(ansFromAbove);
        return list;

    }
}
