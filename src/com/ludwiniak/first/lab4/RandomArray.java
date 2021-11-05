package com.ludwiniak.first.lab4;

import java.util.Random;

public class RandomArray {
    public int[][] arr = new int[10][];

    public RandomArray(){
        for(int i = 0; i < 10; i++) {
            arr[i] = new int[getRandom(1, 10)];
        }
    }

    public int getRandom(int from, int to) {
        Random random = new Random();
        return random.nextInt(to - from) + from;
    }

    public int localMax(int[] localArr) {
        int max = -1;

        for(int i = 0; i < localArr.length; i++) {
            if(localArr[i] > max) {
                max = localArr[i];
            }
        }

        return max;
    }

    public int localMin(int index) {
        int min = 1001;

        for(int i = 0; i < arr[index].length; i++) {
            if(arr[index][i] < min) {
                min = arr[index][i];
            }
        }

        return min;
    }

    public double localAvg(int index) {
        int sum=0;

        for(int i = 0; i < arr[index].length; i++) {
                 sum += arr[index][i];
        }

        return sum / (double)arr[index].length;
    }

    public int globalMax() {
        int max = -1;

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        return max;
    }

    public int globalMin() {
        int min = 101;

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        return min;
    }

    public double globalAvg() {
        int sum = 0, avg = 0;

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                avg++;
            }
        }

        return sum/(double)avg;
    }


    public void randomFill() {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = getRandom(1, 100);
            }
        }
    }

    public void printArr() {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            System.out.println();
        }
    }


}
