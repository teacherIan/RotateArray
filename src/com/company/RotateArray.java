package com.company;

import java.util.Arrays;

public class RotateArray {

    private int[][] arr = new int[10][10];

     public RotateArray() {
         arr[0] = new int[]{0,0,0,0,0,0,0,1,0,0};
         arr[1] = new int[]{0,0,0,1,0,0,0,0,1,0};
         arr[2] = new int[]{0,0,0,1,0,0,0,0,0,1};
         arr[3] = new int[]{0,0,0,1,0,0,0,0,0,0};
         arr[4] = new int[]{0,0,0,1,0,0,0,0,0,0};
         arr[5] = new int[]{0,0,0,1,0,0,0,0,0,0};
         arr[6] = new int[]{0,0,0,1,0,0,0,0,0,0};
         arr[7] = new int[]{0,0,0,1,0,0,0,0,0,0};
         arr[8] = new int[]{0,0,0,1,1,1,1,1,0,0};
         arr[9] = new int[]{0,0,0,0,0,0,0,0,0,0};

     }

     public void printArray() {

         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.print(arr[i][j] + ", ");
             }
             System.out.println();
         }

         }

     public void switchRowsColumnsWithCopy() {

         System.out.println("In switch rows columns ");
         System.out.println("+++++++++++++++++++++++++++++++++");

         int[][] copy;
         copy = arr;

         for(int i = 0; i < arr.length; i ++) {
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.print(copy[j][i] + ", ");
             }
             System.out.println();
         }
     }
    public void switchRowsColumnsReverseRowWithCopy() {

        System.out.println("In switch rows columns reverse Row ");
        System.out.println("+++++++++++++++++++++++++++++++++");

        int[][] copy;
        copy = arr;

        for(int i = 0; i < arr.length; i ++) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(copy[j][i] + ", ");
            }
            System.out.println();
        }
    }




}
