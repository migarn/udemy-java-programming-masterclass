package com.yyy;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-11211));

    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int num = number;
        while (num != 0) {
            lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        return reverse == number;
    }
}
