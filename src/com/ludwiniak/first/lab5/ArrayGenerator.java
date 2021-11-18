package com.ludwiniak.first.lab5;

import java.util.Random;

public class ArrayGenerator {

    public static int[][] getRandom2DArr(int[] arrayLengths) {
        int[][] arr = new int[arrayLengths.length][];


        for (int i = 0; i < arrayLengths.length; i++) {
            arr[i] = new int[arrayLengths[i]];
            for (int j = 0; j < arrayLengths[i]; j++) {
                arr[i][j] = getRandom();
            }
        }

        return arr;
    }

    public static int[] getRandomArr(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = getRandom();
        }
        return arr;
    }

    private static int getRandom() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
