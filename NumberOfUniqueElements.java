package com.meghana;

class NumberOfUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1,1,2,4,5,6,6,7,8,9,9,10,11,12};
        System.out.println(removeDuplicates(nums));

    }
    public static int removeDuplicates(int[] nums) {
        int j =1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != nums[i-1] ){
                nums[j] = nums[i];
                j++;
            }

        }
        return j;
        
    }
}