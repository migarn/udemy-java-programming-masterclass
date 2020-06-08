package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int greatestCommonDivisor = 0;
        for (int i=1; i <= first; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
}
