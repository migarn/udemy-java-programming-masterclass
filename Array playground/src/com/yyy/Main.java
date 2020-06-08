package com.yyy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        int[] sortedArray = Arrays.copyOf(array,array.length);
        int[] workArray = Arrays.copyOf(sortedArray,sortedArray.length);
        int correctOrder = 0;

        for (int i = 0; i < array.length - 1; i++) {
            workArray = Arrays.copyOf(sortedArray,sortedArray.length);
            if (sortedArray[i] > sortedArray[i + 1]) {
                correctOrder += 1;
            } else {
                sortedArray[i] = workArray[i + 1];
                sortedArray[i + 1] = workArray[i];
            }
        }

//        int a = 1;
//        int b = a;
//        b=2;
//        System.out.println(a);


        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("\n");
        System.out.println(sortedArray[0]);
        System.out.println(sortedArray[1]);
        System.out.println(sortedArray[2]);
        System.out.println("\n");
        System.out.println(correctOrder);
        System.out.println("\n");
        System.out.println(workArray[0]);
        System.out.println(workArray[1]);
        System.out.println(workArray[2]);
    }

    // int[] newArray = Arrays.copyOf(test, test.length);
}
