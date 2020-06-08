package com.yyy;

public class SubClass extends SuperClass {

    public void printMethodSub() {
        System.out.println("Printed in Subclass");
    }

    @Override
    public void printMethod() {
        super.printMethod();
//        printMethodSub();
        System.out.println("Printed in Subclass");
    }
}
