package com.ludwiniak.first.lab4;

import java.util.Random;

public class Matrix {
    private final int n;
    private final int m;
    private final int[][] matrix;

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        matrix = new int[m][n];
    }

    public void fillMatrix() {
        Random random = new Random();

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100) + 1;
            }

    }

    public void print() {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public Matrix multiply(Matrix secondMatrix) {
        Matrix resultMatrix = new Matrix(m, secondMatrix.n);

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < secondMatrix.n; j++) {
                int sum = 0;
                for(int k = 0; k < n; k++) {
                    sum += matrix[i][k] * secondMatrix.matrix[k][j];
                }
                resultMatrix.matrix[i][j] = sum;
            }
        }

        return resultMatrix;
    }
}
