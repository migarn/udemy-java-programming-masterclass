package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
        System.out.println(shouldWakeUp(true,23));
        System.out.println(shouldWakeUp(false,23));
        System.out.println(shouldWakeUp(true,50));
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
        if (hourOfDay<0 || hourOfDay>23) {
            return false;
        } else if (barking==true && (hourOfDay<8 || hourOfDay>22)) {
            return true;
        } else return false;
    }
}
