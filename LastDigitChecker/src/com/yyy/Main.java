package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int p1, int p2, int p3) {

        if (!isValid(p1) || !isValid(p2) || !isValid(p3)) {
            return false;
        }
        int last1 = p1 % 10;
        int last2 = p2 % 10;
        int last3 = p3 % 10;
        return (last1 == last2 || last1 == last3 || last2 == last3);
    }

    public static boolean isValid(int p) {
        return (p >= 10 && p <= 1000);
    }

}
