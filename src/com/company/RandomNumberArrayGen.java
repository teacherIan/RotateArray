package com.company;

import java.util.Random;

public class RandomNumberArrayGen {

    int min;
    int max;
    int amount;
    int[] randomNumberArr;

    public RandomNumberArrayGen(int min, int max, int amount) {
        this.min = min;
        this.max = max;
        this.amount = amount;
        this.randomNumberArr = new int[amount];
        populateArray();

    }

    private void populateArray() {
        Random r = new Random();
        for(int i = 0; i < amount; i++) {
            randomNumberArr[i] = r.nextInt(max - min) + min;
        }
    }

    public void displayRandomNumArray() {
        for (int i = 0; i < amount; i++) {
            System.out.print("[");
            System.out.print(randomNumberArr[i]);
            System.out.print("]");
        }
    }
}
