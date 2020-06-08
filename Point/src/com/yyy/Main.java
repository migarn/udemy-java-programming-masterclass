package com.yyy;

public class Main {

    public static void main(String[] args) {
        Point punkt1 = new Point();
        Point punkt2 = new Point(5,5);
        punkt1.setX(6);
        punkt1.setY(5);
        System.out.println(punkt1.getX());
        System.out.println(punkt1.getY());
        System.out.println(punkt1.distance());
        System.out.println(punkt1.distance(2,2));
        System.out.println(punkt1.distance(punkt2));


    }
}
