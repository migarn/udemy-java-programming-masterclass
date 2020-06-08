package com.yyy;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall();
        wall1.setHeight(-1);
        wall1.setWidth(-5);
        System.out.println(wall1.getHeight());
        System.out.println(wall1.getWidth());
        System.out.println(wall1.getArea());

        Wall wall2 = new Wall(-12.5,-2.3);
        System.out.println(wall2.getHeight());
        System.out.println(wall2.getWidth());
        System.out.println(wall2.getArea());
    }
}
