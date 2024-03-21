package com.chicky;

import java.util.ArrayList;
import java.util.List;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,3,8,3,9,0,6};
        ArrayList<Integer> ans  = returnList(arr,0,3, new ArrayList<>());
        System.out.println(ans);
    }

    public static ArrayList<Integer> returnList(int[] arr, int index, int target, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return returnList(arr,index+1,target,list);
    }
}
