package com.sushmitha;

import java.util.Arrays;

public class BinarySearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {10,11,14,16},
                {20,21,22,25},
                {30,32,44,46}
        };
        int target = 22;
        int target1 = 25;
        System.out.println(Arrays.toString(search(arr,target1)));
        System.out.println(Arrays.toString( search(arr,target)));
    }

    static int[] search(int[][] matrix, int target ){
        int r = 0;
        int c = matrix.length-1;
        while(r< matrix.length&&c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }if(matrix[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
