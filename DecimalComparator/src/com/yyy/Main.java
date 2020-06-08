package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3, 3));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println(areEqualByThreeDecimalPlaces(-3.1759, -3.1761));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int newFirst = (int) (1000 * firstNumber);
        int newSecond = (int) (1000 * secondNumber);
        if (newFirst == newSecond) {
            return true;
        } else return false;

    }
}
