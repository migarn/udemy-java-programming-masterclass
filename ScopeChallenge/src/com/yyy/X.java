package com.yyy;

import java.util.Scanner;

public class X {
    private int x;

    public X() {
//        this.x = x;
//        x(x);
    }

    public void x(int x) {
        if (x < 1 || x > 12)
            System.out.println("Inserted number cannot be less than 1 and greater than 12");
        else {
            System.out.println("\nTimes table for " + x + ":\n");
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= x; j++) {
                    System.out.print((j * i) + "\t");
                }
                System.out.println();
            }
        }
    }

    public int x() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter number:");
        return x.nextInt();
    }
}
