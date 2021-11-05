package com.ludwiniak.first.lab4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class HundredArray {
    private final int[] arr = new int[100];

    public HundredArray() {
        initRandomArr();
        StringBuilder stringBuilder;

    }

    private void initRandomArr() {
        Random random = new Random();

        for(int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100) + 1;
            System.out.println(arr[i]);
        }
    }

    public void printArray() {
        for(int i = 0; i < 100; i++) {
            System.out.println(arr[i]);
        }
    }

    public int getMaxArrayItem() {
        int maximumValue = arr[0];

        for(int i = 1; i < 100; i++) {
            int value = arr[i];

            if(value > maximumValue) {
                maximumValue = value;
            }
        }

        return maximumValue;
    }
    public int getMinArrayItem() {
        int minimumValue = arr[0];

        for(int i = 1; i < 100; i++) {
            int value = arr[i];

            if(value < minimumValue) {
                minimumValue = value;
            }
        }

        return minimumValue;
    }
    private int countArraySum() {
        int sum = 0;

        for(int i = 0; i < 100; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public double getAverageOfArray() {
        return countArraySum() / 100.;
    }

    public ArrayList<Integer> getEvenValues() {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            if(arr[i] % 2 == 0) {
                numbers.add(arr[i]);
            }
        }

        return numbers;
    }
    public int countEvens() {
        int counter = 0;
        for(int i = 0; i < 100; i++) {
            if(arr[i] % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }
    public int[] getEvenValues2() {
        int[] numbers = new int[countEvens()];
        int iterator = 0;
        for(int i = 0; i < 100; i++) {
            if(arr[i] % 2 == 0) {
                numbers[iterator++] = arr[i];
            }
        }

        return numbers;
    }
}
