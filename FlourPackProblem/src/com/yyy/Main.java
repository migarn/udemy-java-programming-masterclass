package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 5, 5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        boolean result = false;
        for (int i = 0; i <= bigCount; i++) {
            for (int j = 0; j <= smallCount; j++) {
                if (i * 5 + j == goal) {
                    result = true;
                }
            }
        }
        return result;
    }
}
