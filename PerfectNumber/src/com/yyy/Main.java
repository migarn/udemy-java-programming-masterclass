package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber2(5));
    }
    public static boolean isPerfectNumber (int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i=1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return (number == sum);
    }

    public static boolean isPerfectNumber2 (int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        return (number == sum);
    }
}
