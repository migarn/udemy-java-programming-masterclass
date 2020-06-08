package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
    }

    public static boolean isOdd(int number) {
        if((number > 0) && (number % 2 != 0)) {
            return true;
        } return false;
    }

    public static int sumOdd(int start, int end) {
        if ((end >= start) && start > 0) {
            int sum=0;
            for (int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sum += i;
                }
            } return sum;
        } return -1;
    }
}
