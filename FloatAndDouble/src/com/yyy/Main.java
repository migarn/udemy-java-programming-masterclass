package com.yyy;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue=5/2;
        // width of float = 32 (4 bytes)
        float myFloatValue=5f/3f;
        // wifth of double = 64 (8 bytes)
        double myDoubleValue=5d/3d;

        System.out.println("myIntValue="+myIntValue);
        System.out.println("myFLoatValue="+myFloatValue);
        System.out.println("myDoubleValue"+myDoubleValue);

        System.out.println("Challenge");

        double pounds=200d;
        double kilograms=pounds*0.45359237d;

        System.out.println(pounds+" pounds = "+kilograms+" kilograms");

        double p1=3.141_592d;
    }
}
