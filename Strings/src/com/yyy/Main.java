package com.yyy;

public class Main {

    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString="This is a string";
        System.out.println("My string is equal to "+myString);
        myString=myString+" ans this is more.";
        System.out.println("My string is equal to "+myString);
        myString=myString+"\u00A9";
        System.out.println("My string is equal to "+myString);

        String numberString="250.55";
        numberString=numberString+"49.45";
        System.out.println(numberString);

        String lastString="10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println(lastString);

        double doubleNumber=120.47;
        lastString=lastString+doubleNumber;
        System.out.println(lastString);

        // Czy można dać cudzysłów w string?
        // Czy można wypluć \u00A9?

        System.out.println("Cudzysłowy i inne znaki w string:");
        String cudzyslow="\"Zmienna String w cudzysłowie\"";
        String unicode="\\u00A9";
        System.out.println(cudzyslow);
        System.out.println(unicode);
    }
}
