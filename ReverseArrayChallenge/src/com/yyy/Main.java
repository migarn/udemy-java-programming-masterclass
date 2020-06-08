package com.yyy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[] {1, 2, 1, 4, 5, 8, 100, -5};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array) {

        int[] reversedArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            reversedArray[array.length - 1 - i] = array[i];
        }
        for(int i = 0; i < array.length; i++) {
            array[i] = reversedArray[i];
        }
    }
}
