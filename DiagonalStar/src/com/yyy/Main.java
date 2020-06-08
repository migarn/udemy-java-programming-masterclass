package com.yyy;

public class Main {

    public static void main(String[] args) {
        printSquareStar(10);
    }

    public static void printSquareStar(int number) {
        if (number < 5)
            System.out.println("Invalid Value");
        else {
            for (int r = 1; r <= number; r++) {
                for (int c = 1; c <= number; c++) {
                    if (r == 1 || r == number || c == 1 || c == number || r == c || c == number - r + 1)
                        System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static void printSquareStar1(int number) {
        if (number < 5)
            System.out.println("Invalid Value");
        else {
            for (int r = 1; r <= number; r++) {
                for (int c = 1; c <= number; c++) {
                    if (c != number && (r == 1 || r == number || c == 1 || r == c || c == number - r + 1))
                        System.out.print("*");
                    else if (c == number)
                        System.out.println("*");
                    else System.out.print(" ");
                }
            }
        }
    }

    public static void printSquareStar2(int number) {
        if (number < 5)
            System.out.println("Invalid Value");
        else {
            for (int i = 1; i < number; i++) {
                System.out.print("*");
            }
            System.out.println("*");

            for (int r = 2; r < number; r++) {
                for (int c = 1; c <= number; c++) {
                    if (r == c)
                        System.out.print("*");
                    else if (c == 1)
                        System.out.print("*");
                    else if (c == number - r + 1)
                        System.out.print("*");
                    else if (c == number)
                        System.out.println("*");
                    else
                        System.out.print(" ");
                }
            }
            for (int i = 1; i < number; i++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}
