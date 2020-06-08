package com.yyy;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);

        System.out.println("CHALLENGE");

        System.out.println(isEvenNumber(5));

        int parameter = 4;
        int finishParameter = 20;
        while (parameter <= finishParameter) {
            parameter++;
            if (!isEvenNumber(parameter)) {
                continue;
            }
            System.out.println("Even number " + parameter);
        }

        parameter = 4;
        while (parameter <= finishParameter) {
            parameter++;
            if (isEvenNumber(parameter)) {
                System.out.println("Even number " + parameter);
            }
        }

        System.out.println("CHALLENGE");

        parameter = 4;
        int count1=0;
        int sum=0;
        while (parameter <= finishParameter) {
            parameter++;
            if (!isEvenNumber(parameter)) {
                continue;
            }
            count1++;
            sum+=parameter;
            System.out.println("Even number " + parameter);
            if(count1==5) {break;}
        }
        System.out.println("Sum of even numbers above is " + sum);


    }

    public static boolean isEvenNumber(int parameter) {
        return parameter % 2 == 0;
    }
}
