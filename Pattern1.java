package com.meghana;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pattern1 {
    public static void main(String[] args) {
      //  int n = 5;
        pattern5(4);
    }
    static void  PatternsExample(int n) {
        for(int row = 0 ; row<2*n ; row++){
            int colsInRow = row>n ? 2*n-row : row;
            int noOfSpaces = n-colsInRow;
            for(int s =0;s<noOfSpaces;s++){
                System.out.print(" ");
            }
            for(int col =0 ; col<colsInRow ; col++){
                System.out.print( " *" );
            }
          //  System.out.println();
        }
    }

    static  void pattern2(int n){
        for(int row =1 ; row<=n ; row++){
            for(int space =0 ; space <= n-row ; space++){
                System.out.print(" ");
            }
            for(int col =row;col>=1;col--){
                System.out.print(col);
            }
            for(int col =2;col<=row;col++){
                System.out.print(col);
            }
         //   System.out.println();
        }

    }
    static  void pattern5(int n){
       int  OriginalN = n;
       n = 2*n-1;
        for(int row =0 ; row<=n ; row++){
            for(int col =0 ; col<=n; col++) {
                int atEveryIndex = OriginalN - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
            }
            //   System.out.println();
        }
}
