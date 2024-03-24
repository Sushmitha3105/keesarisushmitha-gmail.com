package com.meghana;

import java.util.Arrays;

class SortArrayByParity{
    public static void main(String[] args) {
       int[] nums ={3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));

    }
    public static int[] sortArrayByParity(int[] nums) {
        int i = 0 ;
        int j = nums.length-1;
        while(i<j){
            while(i<j && nums[i]%2 == 0 ){
                i++;
            }while(i<j && nums[j]%2 != 0){
                j--;
            } if(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }else return nums;
        } 
        
        return nums;
    }
}