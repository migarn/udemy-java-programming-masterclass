package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime1(-1));
        System.out.println(getLargestPrime(-1));
    }
    public static int getLargestPrime1(int number) {
        if (number <= 1)
            return -1;
        int result = -1;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && isPrime(i))
               result = i;
        }
        return result;
    }

    public static boolean isPrime(int factor) {
        int count=0;
        for (int i = 1; i <= factor; i++) {
            if (factor % i == 0)
                count += 1;
        }
        return (count == 2);
    }

    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;
        int result = -1;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                int count=0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                        count += 1;
                }
                if (count == 2)
                    result = i;
            }
        }
        return result;
    }


}
