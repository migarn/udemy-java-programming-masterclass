package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }
    public static boolean hasTeen(int p1, int p2, int p3) {
        return (isTeen(p1) || isTeen(p2) || isTeen(p3));
    }

    public static boolean isTeen(int p4) {
        return (p4 >= 13 && p4 <= 19);
    }
}
