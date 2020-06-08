package com.company;

public class Main {

    public static void main(String[] args) {

        //1
        byte myByte=3;
        //2
        short myShort=10;
        //3
        int myInt=50000;
        //4
        long myLong=50000L+10L*(myByte+myInt+myShort);
        short shortTotal=(short) (1000+10*(myByte+myShort+myInt));
        System.out.println("myLong="+myLong);
        System.out.println("shortTotal="+shortTotal);
    }
}
