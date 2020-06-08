package com.yyy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegers();
        System.out.println("\nTyped array:");
        printArray(array);
        System.out.println("\nTyped array sorted in descending order:");
        printArray(sortIntegers(array));
    }

    public static int[] getIntegers() {
        int number;
        boolean isPositive = false;
        do {
            System.out.println("Enter number of integers to type:");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("The number must be positive!");
            } else
                isPositive = true;
        }
        while (!isPositive);

        System.out.println("Enter " + number + " integer values:");
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int correctOrder;

        do {
            correctOrder = 0;
            for (int i = 0; i < array.length - 1; i++) {
                int[] workArray = Arrays.copyOf(sortedArray, sortedArray.length);
                if (sortedArray[i] >= sortedArray[i + 1]) {
                    correctOrder += 1;
                } else {
                    sortedArray[i] = workArray[i + 1];
                    sortedArray[i + 1] = workArray[i];
                }
            }
        }
        while (correctOrder < array.length - 1);

        return sortedArray;
    }

    public static int[] sortIntegers2(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
