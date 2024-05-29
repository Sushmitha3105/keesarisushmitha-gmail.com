package DSA100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kth_Smallest_and_Largest {
    public static void main(String[] args) {
        int[] nums = {8,5,9,2,6,1,3,4,11,33,12};
        int k = 2;
        List<Integer> l1 = new ArrayList<>();
        System.out.println("Before Sorting" +Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("After Sorting" +Arrays.toString(nums));
        for(int i = 0 ; i<nums.length ; i++){
            l1.add(nums[i]);
        }
        System.out.println(l1.get(k-1));
        System.out.println(l1.get(nums.length-k));
    }
}
