package com.yyy;

public class Main {

    public static void main(String[] args) {
	String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        numberAsString = "2108.125";
        double numberD = Double.parseDouble(numberAsString);
        System.out.println(numberD);
        numberAsString += 1;
        numberD += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("numberD = " + numberD);
    }
}
