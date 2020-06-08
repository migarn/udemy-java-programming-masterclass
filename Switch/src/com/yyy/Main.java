package com.yyy;

public class Main {

    public static void main(String[] args) {

//	int value = 3;
////	if (value == 1) {
////        System.out.println("Value was 1");
////    } else if (value == 2) {
////        System.out.println("Value was 2");
////    } else {
////        System.out.println("Was not 1 or 2");
////    }

        int switchValue = 7;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Value was a 3, or a 4, or a 5");
                System.out.println("Value was actually a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;

        }

        char newChar = 'F';
        switch (newChar) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("newChar is equal A, B, C, D or E");
                break;

            default:
                System.out.println("Not found");
                break;
        }

        String month = "JanuaRy";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

    }
}
