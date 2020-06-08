package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }
    static public int sumFirstAndLastDigit(int number) {
        if (number < 0) {return -1;}
        else {
            int lastDigit = number % 10;
            int reverse = 0;
            while (number > 0) {
                int remainder = number % 10;
                reverse = 10 * reverse + remainder;
                number /= 10;
            }
            int firstDigit = reverse % 10;
            return firstDigit + lastDigit;
        }
    }
}
