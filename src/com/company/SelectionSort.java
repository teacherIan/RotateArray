package com.company;

import java.util.Arrays;

public class SelectionSort {
    int counter;
    int[] sortedArray;

    public SelectionSort(int[] randomNumberArray) {
        this.sortedArray = randomNumberArray;
        counter = 0;
        sort();
    }

    private void sort() {

        for(int i = 0; i < sortedArray.length; i++) {
            int largestIndex = i;
            for (int j = i + 1; j < sortedArray.length; j++) {
                if(sortedArray[j] > sortedArray[largestIndex]) {
                    largestIndex = j;
                }
            }
            if(largestIndex != i){
                counter++;
                UtilityClass.swap(sortedArray, i, largestIndex);
            }
        }
    }

    public void displaySelectionSort() {
        System.out.println("Sort by Selection Sort:");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Counter ran: " + counter);
        System.out.println("++++++++++++++++++++++++++++++++++");
    }


}
