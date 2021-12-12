package com.ludwiniak.first;


import com.ludwiniak.first.hotel.Hotel;
import com.ludwiniak.first.hotel.Person;
import com.ludwiniak.first.hotel.Room;
import com.ludwiniak.first.lab4.Matrix;
import com.ludwiniak.first.lab4.RandomArray;
import com.ludwiniak.first.lab5.ArrayGenerator;
import com.ludwiniak.first.lab5.BinaryMatrix;
import com.ludwiniak.first.lab5.BubbleSort;
import com.ludwiniak.first.lab5.Divisibility;
import com.ludwiniak.first.lab8.Studies.Enums.Gender;
import com.ludwiniak.first.lab8.Studies.Studies;
import com.ludwiniak.first.lab8.Studies.Utils.ConsoleReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Studies studies = new Studies();
            studies.printAllPersons();


        }catch (IOException | ClassNotFoundException err) {
            System.out.println(err.getMessage());
        }
    }


    public static void testBinary() {
        BinaryMatrix binaryMatrix = new BinaryMatrix();
        binaryMatrix.fillMatrix();
        binaryMatrix.print();
        System.out.println(binaryMatrix.isFeedback());
        System.out.println(binaryMatrix.isCounterFeedback());
        System.out.println(binaryMatrix.isSymmetric());
        System.out.println(binaryMatrix.isNonSymmetric());
    }

    public static void testDiv() {
        int[] firstArr = ArrayGenerator.getRandomArr(10);
        int[] secondArr = ArrayGenerator.getRandomArr(10);
        print(firstArr);
        System.out.println();
        print(secondArr);
        System.out.println(Divisibility.check(firstArr, secondArr));
    }

    public static void testBubbleSort() {
        int[][] arr = ArrayGenerator.getRandom2DArr(new int[]{6, 10, 10, 4, 10, 10, 9, 10, 10, 8});
        print2D(arr);
        BubbleSort.sort2DByRows(arr);
        System.out.println();
        print2D(arr);
    }

    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void print2D(int[][] arr) {
        for (int[] i : arr) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void testRandom() {
        RandomArray randomArray = new RandomArray();
        randomArray.randomFill();
        randomArray.printArr();
        System.out.println();
//        System.out.println(randomArray.globalMax());
//        System.out.println(randomArray.globalMin());
//        System.out.println(randomArray.globalAvg());
        for(int i = 0; i<10; i++) {
            System.out.println(randomArray.localMax(randomArray.arr[i]));
        }
//        System.out.println(randomArray.localMin(1));
//        System.out.println(randomArray.localAvg(1));
    }

    public static void testHotel() {
        Room[] rooms = new Room[10];
        for(int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i+1);
        }
        Person filip = new Person("Filip");
        Person andrew = new Person("Andrew");
        Person victor = new Person("Victor");
        Person ben = new Person("Ben");
        Person david = new Person("David");
        Person jessica = new Person("Jessica");

        rooms[0].reserve(filip);
        rooms[1].reserve(andrew);
        rooms[2].reserve(victor);
        rooms[3].reserve(ben);
        rooms[4].reserve(david);
        rooms[5].reserve(david);
        rooms[6].reserve(jessica);
        rooms[7].reserve(filip);
        rooms[8].reserve(filip);
        rooms[9].reserve(jessica);

        Hotel hotel = new Hotel(rooms);

        if (hotel.whetherAnyRoomIsFree()) {
            System.out.println("Są wolne pokoje");
        } else {
            System.out.println("Nie ma wolnych pokoji");
        }
    }

    public static void testMatrix() {
        Matrix matrix = new Matrix(2, 5);
        matrix.fillMatrix();
        matrix.print();
        System.out.println();
        Matrix matrix2 = new Matrix(5, 2);
        matrix2.fillMatrix();
        matrix2.print();
        System.out.println();
        Matrix resultMatrix = matrix.multiply(matrix2);
        resultMatrix.print();
    }


    public static double e(int x, int n) {
        double result = 1;
        double lastArg = 1;
        for(int k = 1; k <= n; k++) {
            lastArg *= (double) x / k;
            result += lastArg;
        }
        return  result;

    }


    public  static long factorial(int count) {
        long result = 1;

        for(int i=1; i <= count; i++) {
            result *= i;
        }
        return result;
    }

    public static long pow(int x, int k) {
        long res = 1;

        for(int i  = 0; i < k; i++) {
            res *= x;
        }

        return res;
    }
}






