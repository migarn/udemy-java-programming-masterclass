package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }
    public static boolean hasEqualSum(int p1,int p2, int p3) {
        return p1 + p2 == p3;
    }
}
