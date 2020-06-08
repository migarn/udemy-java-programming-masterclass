package com.yyy;

public class Main {

    public static void main(String[] args) {

        for (double interestRate = 2; interestRate <= 8; interestRate++) {
            System.out.println("10000 at " + (int) interestRate + "% interest = " + calculateINterest(10000, interestRate));
        }

        for (int i = 8; i >= 2; i--) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f", calculateINterest(10000, i)));
        }

        System.out.println("****************************");

        int j = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                j++;
                if (j == 10) {
                    break;
                }
            }

        }
    }

    public static double calculateINterest(double amount, double interestRate) {
        return (amount * interestRate / 100);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
