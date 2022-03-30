package com.company;

public class UtilityClass {

    public static void swap(int[] arr, int A, int B) {
        int temp = arr[A];
        arr[A] = arr[B];
        arr[B] = temp;
    }
}
