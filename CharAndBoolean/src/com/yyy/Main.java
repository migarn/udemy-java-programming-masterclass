package com.yyy;

public class Main {

    public static void main(String[] args) {

        // width of char is 16 (2 bytes)
        char myChar='3';
        char myCharUnicode='\u00A9';
        System.out.println("Unicode output was: "+myCharUnicode);

        boolean myBoolean1=false;
        boolean isMale=true;

        //Challenge
        char rSymbol='\u00AE';
        System.out.println("Registered symbol is "+rSymbol);

    }
}
