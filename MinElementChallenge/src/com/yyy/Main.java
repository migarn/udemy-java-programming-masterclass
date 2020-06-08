package com.yyy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isPositive = false;
        int count = 0;

        do {
            System.out.println("Type number of integers, you want to enter:");
            count = scanner.nextInt();
            if (count <= 0)
                System.out.println("The number must be positive!");
            else
                isPositive = true;
        }
        while (!isPositive);

        int[] array = readIntegers(count);
        System.out.println("Inserted array is: " + Arrays.toString(array));
        System.out.println("Minimum element of the array is: " + findMin(array));

    }

    public static int[] readIntegers(int count) {

        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter integer no #" + (i + 1));
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array) {

        int min = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (min > array[i + 1])
                min = array[i + 1];
            }

        return min;
    }
}