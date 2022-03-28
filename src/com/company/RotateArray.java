package com.company;

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
         for(int[] outerArr : arr) {
             for(int num : outerArr ) {
                 System.out.print(num + ", " );
             }
             System.out.println();
         }

     }
}
