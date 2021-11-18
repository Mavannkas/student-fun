package com.ludwiniak.first.lab5;

import java.util.Random;

public class BubbleSort {

    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int el = arr[i];
                    arr[i] = arr[j];
                    arr[j] = el;
                }
            }
        }
    }

    public static void sort2DByRows(int[][] numberArrays) {
        for(int[] numbers : numberArrays) {
            sort(numbers);
        }
    }

    public static void sort2DByCols(int[][] arr, int cols) {
        for (int z = 0; z < arr.length * cols; z++) {

            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j][i] > arr[j + 1][i]) {
                        int el = arr[j][i];
                        arr[j][i] = arr[j + 1][i];
                        arr[j + 1][i] = el;
                    }
                }
            }
        }
    }


    public static void sort2DAll(int[][] arr) {
        for(int _i = 0; _i < arr.length; _i++) {
            for(int _j = 0; _j < arr[_i].length; _j++) {
                for(int i = 0; i < arr.length; i++) {
                    for(int j = 0; j < arr[i].length; j++) {
                        int nextJ = j + 1 >= arr[i].length ? 0 : j + 1;

                        if(j + 1 != nextJ && i + 1 >= arr.length) {
                            continue;
                        }

                        int nextI = j + 1 != nextJ ? i + 1 : i;

                        if(arr[i][j] > arr[nextI][nextJ]) {
                            int el = arr[i][j];
                            arr[i][j] = arr[nextI][nextJ];
                            arr[nextI][nextJ] = el;
                        }
                    }
                }
            }
        }
    }


}
