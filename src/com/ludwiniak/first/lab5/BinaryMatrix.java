package com.ludwiniak.first.lab5;

import com.ludwiniak.first.lab4.Matrix;

import java.util.Random;

public class BinaryMatrix extends Matrix {

    public BinaryMatrix() {
        super(2, 2);
    }

    @Override
    public void fillMatrix() {
        Random random = new Random();

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2);
            }

    }

    private int countDiagonal() {
        int counter = 0;
        for(int i = 0; i < m; i++) {
            if(matrix[i][i] == 1) {
                counter++;
            }
        }
        return counter;
    }

    public boolean isFeedback () {
        return countDiagonal() == 5;
    }

    public boolean isCounterFeedback () {
        return countDiagonal() == 0;
    }

    public boolean isSymmetric () {
        for(int i = 1; i < m; i++) {
            for(int j = i + 1; j < n; j++) {
                if(!(matrix[i][j] == matrix[j][i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isNonSymmetric () {
        for(int i = 0; i < m; i++) {
            for(int j = i ; j < n; j++) {
                if(matrix[i][j] == 1 && matrix[i][j] == matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }


}
