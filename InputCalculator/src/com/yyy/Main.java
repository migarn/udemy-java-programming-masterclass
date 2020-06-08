package com.yyy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                sum += scanner.nextInt();
                count++;
            } else
                break;
        }
        double average = (double) sum / count;
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        scanner.close();
    }
}


