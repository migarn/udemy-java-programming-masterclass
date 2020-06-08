package com.yyy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        while (true) {
            System.out.println("Enter number");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                count++;
                if (number > max)
                    max = number;
                if (number < min)
                    min = number;
            } else
                break;
        }
        if (count != 0)
            System.out.println("Minimum number = " + min + ", and maximum number = " + max);
        scanner.close();
    }
}
