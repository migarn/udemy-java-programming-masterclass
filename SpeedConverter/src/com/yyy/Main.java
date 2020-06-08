package com.yyy;

public class Main {

    public static void main(String[] args) {
	double kilometersPerHour=1.5;
	toMilesPerHour(kilometersPerHour);
	printConversion(kilometersPerHour);
	kilometersPerHour=-5;
        toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour);
	kilometersPerHour=100;
        toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour);
	kilometersPerHour=60;
        toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour);
	kilometersPerHour=10.25;
        toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour);
	kilometersPerHour=25.42;
        toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour<0) {
            return -1;
        } return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour<0) {
            System.out.println("Invalid Value");
        }
        else System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
    }
}
