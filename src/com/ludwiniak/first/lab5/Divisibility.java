package com.ludwiniak.first.lab5;

public class Divisibility {
    public static int check(int[] first, int[] second) {
        int counter = 0;

        for (int k : first) {
            int divCounter = 0;
            for (int i : second) {
                if (k % i == 0) {
                    divCounter++;
                }
            }
            if (divCounter >= 3) {
                counter++;
            }
        }
        return counter;
    }
}
