package com.yyy;

public class Main {

    public static void main(String[] args) {
        int newScore = calculatescore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculatescore(75);
        calculatescore();

        // Challenge
       calcFeetAndInchesToCentimeters(11,-13);
       calcFeetAndInchesToCentimeters(13);


    }

    public static int calculatescore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculatescore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculatescore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches parameters.");
            return -1;
        } else {
            double centimeters=feet * 12 * 2.54 + inches * 2.54;
           System.out.println(feet + " feet + " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
        }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            double newFeet = (int) inches / 12;
            double newInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + newFeet + " feet and " + newInches + " inches.");
            return calcFeetAndInchesToCentimeters(newFeet,newInches);
        }
    }


}
