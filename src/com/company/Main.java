package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Finish this program
        RandomNumberArrayGen numGen = new RandomNumberArrayGen(0,10000,1000);
        SelectionSort selectionSort = new SelectionSort(numGen.randomNumberArr);
        selectionSort.displaySelectionSort();


//        RotateArray rotateArray = new RotateArray();
//        rotateArray.printArray();
//        rotateArray.switchRowsColumnsReverseRowWithCopy();
    }


    public static void rotateMenu(RotateArray rotateArray, Scanner scanner) {

        System.out.println("Press 1 to view the array");
        System.out.println("Press 2 to rotate the array 90 degrees");
        System.out.println("Press any other key to exit");



    }
}
