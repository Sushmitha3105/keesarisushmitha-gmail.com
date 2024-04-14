package com.BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(MazeCount(3,3));
//        path("" ,3,3);
//        System.out.println("");
//        System.out.print(pathUsingList(" ",3,3));
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestrictions("",board,0,0);
    }
    static int MazeCount(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = MazeCount(r-1,c);
        int right = MazeCount(r,c-1);
        int diagonal = MazeCount(r-1,c-1);
        return left+right+diagonal;
    }

    static void path(String p ,int r, int c){
        if(r==1 && c==1){
            System.out.print(p+" ");
            return;
        }
        if(r>1){
            path(p+"D",r-1,c);
        }
        if(c>1){
            path(p+"R",r,c-1);
        }
        if(r>1 && c>1){
            path(p+"d",r-1,c-1);
        }
    }

    static ArrayList<String> pathUsingList(String p , int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> l1 = new ArrayList<>();
            l1.add(p);
            return l1;
        }

        ArrayList<String> l2 = new ArrayList<>();
        if (r > 1) {
            l2.addAll(pathUsingList(p + "D", r - 1, c)); //D means down path
        }
        if (c > 1) {
            l2.addAll(pathUsingList(p + "R", r, c - 1));  //R means moving right
        }
        if (r > 1 && c > 1) {
            l2.addAll(pathUsingList(p + "d", r - 1, c - 1)); // d means moving diagonally
        }
        return l2;
    }

    static void pathRestrictions(String p,boolean[][] maze ,int r, int c){
        if(r== maze.length-1 && c ==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r< maze.length-1){
            pathRestrictions(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestrictions(p+'R',maze,r,c+1);
        }
    }
}
