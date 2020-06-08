package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, -2020));
        System.out.println(isLeapYear(2020));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 400 == 0) {
                return true;
            } else if (year % 100 != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth=1;
        if (year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth=31;
                    break;
                case 2:
                    if (isLeapYear(year) == true) {
                        daysInMonth=29;
                    } else {daysInMonth=28;}
                     break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth=30;
                    break;
                default:
                    daysInMonth=-1;
                    break;
            } return daysInMonth;
        }
    }
}
