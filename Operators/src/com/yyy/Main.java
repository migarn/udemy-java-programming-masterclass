package com.yyy;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+2=" + result);

        int previousResult = result;

        result=result-1;
        System.out.println(previousResult+"-1="+result);

        previousResult=result;
        result=result*10;
        System.out.println(previousResult+"*10="+result);

        previousResult=result;
        result=result/5;
        System.out.println(previousResult+"/5="+result);

        // % - reszta
        previousResult=result;
        result=result%3;
        System.out.println(previousResult+"%3="+result);

        previousResult=result;
        result=result+1;
        System.out.println("Result is now "+result);
        result++;
        //++ zwiększa wartość o 1
        System.out.println("Result is now "+result);
        result--;
        //-- zmiejsza wartość o 1
        System.out.println("Result is now "+result);
        result+=2;
        //+=2 zwiększa wartość o 2
        System.out.println("Result is now "+result);

        result*=10;
        System.out.println("Result is now "+result);

        result-=10;
        System.out.println("Result is now "+result);

        result/=10;
        System.out.println("Result is now "+result);

        boolean isAlien=false;
        if (isAlien==false)
            System.out.println("It is not an alien");
        // == to nie definiowanie równości, tylko jej sprawdzanie
        if (isAlien==true)
            System.out.println("It is not an alien");

        int topScore=100;
        if (topScore==100)
            System.out.println("You've got the high score!");
        if (topScore!=100)
            System.out.println("You've got the high score!");
        if (topScore>100)
            System.out.println("You've got the high score!");
        if (topScore>=100)
            System.out.println("You've got the high score!");
        if (topScore<100)
            System.out.println("You've got the high score!");
        if (topScore<=100)
            System.out.println("You've got the high score!");

        int secondTopScore=60;
        topScore=80;
        if ((topScore>secondTopScore) && (topScore<100))
            System.out.println("Greater than second top score and less then 100");

        secondTopScore=81;
        if ((topScore>secondTopScore) && (topScore<100))
            System.out.println("Greater than second top score and less then 100");

        if ((topScore>90) || (secondTopScore<=90))
            System.out.println("One of these tests is true");

        int newValue=50;
        if (newValue==50)
            System.out.println("This is true");

        boolean isCar=false;
        if (isCar==true)
            System.out.println("This is not supposed to happen");

        isCar=true;
        boolean wasCar=isCar ? true : false;
        // Jeśli isCar to true wasCar to true, a jeśli isCar to false, wasCar to false
        if (wasCar)
            System.out.println("wasCar is true");

        // challenge

        double firstDouble=20;
        double secondDouble=80;
        double thirdChallenge=(firstDouble+secondDouble)*25;
        System.out.println(thirdChallenge);
        double fourthChalenge=thirdChallenge%40;
        System.out.println(fourthChalenge);
        if (fourthChalenge<=20)
            System.out.println("Total was over the limit");

        // Nawiasy??





    }
}
