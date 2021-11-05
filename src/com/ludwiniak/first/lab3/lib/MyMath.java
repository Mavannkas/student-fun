package com.ludwiniak.first.lab3.lib;

public class MyMath {
    public static double e2(int x, int n) {
        double result = 1,
                lastArg = 1;
        int k = 1;

        while (k <= n) {
            lastArg *= (double) x / k++;
            result += lastArg;
        }
        return  result;
    }

    public static double sin(int x, int n) {
        return mainCounter(1, x, n, x, x, 1);
    }

    public static double cos(int x, int n) {
        return mainCounter(1, 1, n, x, 1, -1);
    }

    public static double mainCounter(double m, double l, int n, int x, int init, int addValue) {
        double result = init;

        for(int i = 1; i<=n; i++) {
            l *= (x*x);

            m *= 2*i*(2*i+addValue) * -1;

            result += l/(double) m;
        }

        return result;
    }
}
