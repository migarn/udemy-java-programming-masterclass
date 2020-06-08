package com.yyy;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {


    public static void main(String[] args) {

        ArrayList<IntClass> myArrayList = new ArrayList<>();

        myArrayList.add(new IntClass(25));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> secondArrayList = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            secondArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + secondArrayList.get(i).intValue());
        }

        ArrayList<Integer> thirdArrayList = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            thirdArrayList.add(i);
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + thirdArrayList.get(i));
        }

        Integer myIntValue = 54;

        ArrayList<Double> myDoubleValue = new ArrayList<>();
        for(double dbl = 0.0; dbl <= 10; dbl += 0.5) {
            myDoubleValue.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < myDoubleValue.size(); i++) {
            double value = myDoubleValue.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }





    }
}
